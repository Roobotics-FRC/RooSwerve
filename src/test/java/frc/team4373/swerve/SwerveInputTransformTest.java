package frc.team4373.swerve;

import org.junit.jupiter.api.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SwerveInputTransformTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    // @Test
    void generateConsistencyTest() {
        File file = new File(
                "./src/test/java/frc/team4373/swerve/SwerveInputTransformConsistencyTest.java");
        try {
            if (file.createNewFile()) {
                System.out.println("Created new file SwerveInputTransformConsistencyTest.java");
            } else {
                System.out.println("File SwerveInputTransformConsistencyTest.java already exists");
            }
            PrintStream out = new PrintStream(file);

            out.println("package frc.team4373.swerve;");
            out.println();
            out.println("import org.junit.jupiter.api.*;");
            out.println();
            out.println("import static org.junit.jupiter.api.Assertions.fail;");
            out.println();
            out.println("class SwerveInputTransformConsistencyTest {");

            //The `maxWheelSpeed` and `nativeUnitsPerInch` don't matter for tests,
            //  as both the inputs and outputs of SwerveInputTransform are fractions of max speed.
            //  I'd avoid letting them be 0, though.
            //maxWheelSpeed: 7000 (2020 code), 8200 (test bed actual), 9000 (2020 bot actual)
            //nativeUnitsPerInch: 20d/3d*1024/(4*Math.PI)
            SwerveInputTransform transform = new SwerveInputTransform(24, 24,
                    7000, 550);
            int i = 0;

            out.println("    //The `maxWheelSpeed` and `nativeUnitsPerInch` don't matter for tests,");
            out.println("    //  as both the inputs and outputs of SwerveInputTransform are fractions of max speed.");
            out.println("    //  I'd avoid letting them be 0, though.");
            out.println("    SwerveInputTransform transform = new SwerveInputTransform(24, 24, 7000, 550);");
            out.println();
            for (int x = 0; x <= 4; x++) {
                for (int y = 0; y <= 4; y++) {
                    for (int rotation = 0; rotation <= 4; rotation++) {
                        for (int imuAngle = 0; imuAngle < 360; imuAngle = imuAngle + 60) {
                            writeTest(String.format("test%03d", ++i), out,
                                    ((double) rotation) / 4, ((double) x) / 4, ((double) y) / 4,
                                    imuAngle, transform);
                        }
                    }
                }
            }
            writeTest("testOverlyLargeInput1", out,
                    1.2, 0.4, 0.6, 75, transform);
            writeTest("testOverlyLargeInput2", out,
                    0.1, 1.3, 0, 186, transform);
            writeTest("testOverlyLargeInput3", out,
                    0.7, 0.3, 1.1, 20, transform);
            writeTest("testOverlyLargeInput4", out,
                    0.234, 0.171, 0.9, 400, transform);
            writeTest("testNegativeInput1", out,
                    -0.4, 0.7, 0.2, 300, transform);
            writeTest("testNegativeInput2", out,
                    0.08, -0.5, 0.121, 4, transform);
            writeTest("testNegativeInput3", out,
                    0.1, 0.9, -0.333, 50, transform);
            writeTest("testNegativeInput4", out,
                    0.2, 0.6, 0.4, -78, transform);
            out.println("}");
            System.out.println("\n" + (i + 8) + " tests generated.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeTest(String name, PrintStream out,
                           double rotation, double x, double y, double robotAngle,
                           SwerveInputTransform transform) {
        out.println("    @Test");
        out.println("    void " + name + "() {");
        WheelVector.VectorSet set = transform.processNorthUp(rotation, x, y, robotAngle);
        out.println("        WheelVector.VectorSet set"
                + " = transform.processNorthUp("
                + rotation + ", "
                + x + ", "
                + y + ", "
                + robotAngle + ");");
        out.println("        WheelVector.VectorSet expected"
                + " = new WheelVector.VectorSet(");
        out.println("                new WheelVector("
                + set.right1.speed + ", " + set.right1.angle + "),");
        out.println("                new WheelVector("
                + set.right2.speed + ", " + set.right2.angle + "),");
        out.println("                new WheelVector("
                + set.left1.speed + ", " + set.left1.angle + "),");
        out.println("                new WheelVector("
                + set.left2.speed + ", " + set.left2.angle + "));");
        out.println("        boolean equal = set.equals(expected);");
        out.println("        if (!equal) {");
        out.println("            fail(\"VectorSets do not match\"\n"
                + "                    + \"(processing: "
                + "rotation=" + rotation
                + ", x=" + x
                + ", y=" + y
                + ", robotAngle=" + robotAngle + ")\"");
        out.print("                    + \"\\n\\t  ");
        out.println("got:       \" + set.toString()");
        out.print("                    + \"\\n\\t  ");
        out.println("expected:  \" + expected.toString());");
        out.println("        }");
        out.println("    }");
        out.println();
    }

    @Test
    void process() {
        SwerveInputTransform transform = new SwerveInputTransform(24, 24, 7000, 550);
        WheelVector.VectorSet set = transform.processNorthUp(0, 0, 1, 0);
        assertTrue(set.equals(new WheelVector.VectorSet(
                new WheelVector(1, 0),
                new WheelVector(1, 0),
                new WheelVector(1, 0),
                new WheelVector(1, 0))));

        WheelVector.VectorSet set2 = transform.processNorthUp(0, 1, 0, 0);
        assertTrue(set2.equals(new WheelVector.VectorSet(
                new WheelVector(1, 90),
                new WheelVector(1, 90),
                new WheelVector(1, 90),
                new WheelVector(1, 90))));


        WheelVector.VectorSet set3 = transform.processNorthUp(0, 1, 0, -90);
        assertTrue(set3.equals(new WheelVector.VectorSet(
                new WheelVector(1, 180),
                new WheelVector(1, 180),
                new WheelVector(1, 180),
                new WheelVector(1, 180))));

        WheelVector.VectorSet set4 = transform.processTranslation(1, 1);
        assertTrue(set4.equals(new WheelVector.VectorSet(
                new WheelVector(1, 45),
                new WheelVector(1, 45),
                new WheelVector(1, 45),
                new WheelVector(1, 45))));


        WheelVector.VectorSet set5 = transform.processTranslation(0.5, 1);
        assertTrue(set5.equals(new WheelVector.VectorSet(
                new WheelVector(1, 90 - Math.toDegrees(Math.atan(2))),
                new WheelVector(1, 90 - Math.toDegrees(Math.atan(2))),
                new WheelVector(1, 90 - Math.toDegrees(Math.atan(2))),
                new WheelVector(1, 90 - Math.toDegrees(Math.atan(2))))));

        WheelVector.VectorSet set6 = transform.processTranslation(0.1, 0.1);
        assertTrue(set6.equals(new WheelVector.VectorSet(
                new WheelVector(Math.sqrt(0.02), 45),
                new WheelVector(Math.sqrt(0.02), 45),
                new WheelVector(Math.sqrt(0.02), 45),
                new WheelVector(Math.sqrt(0.02), 45))));

        WheelVector.VectorSet set7 = transform.processTranslation(-1, 0);
        assertTrue(set7.equals(new WheelVector.VectorSet(
                new WheelVector(1,270),
                new WheelVector(1, 270),
                new WheelVector(1, 270),
                new WheelVector(1, 270))));

    }
}