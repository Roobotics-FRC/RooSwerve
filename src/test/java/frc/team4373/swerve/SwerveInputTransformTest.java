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
        File file = new File("./src/test/java/frc/team4373/swerve/SwerveInputTransformConsistencyTest.java");
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
            out.println("import static org.junit.jupiter.api.Assertions.assertTrue;");
            out.println();
            out.println("class SwerveInputTransformConsistencyTest {");

            SwerveInputTransform transform = new SwerveInputTransform(24, 24);
            int i = 0;
            out.println("\tSwerveInputTransform transform = new SwerveInputTransform(24, 24);");
            out.println();
            for (int x = 0; x <= 4; x++) {
                for (int y = 0; y <= 4; y++) {
                    for (int rotation = 0; rotation <= 4; rotation++) {
                        for (int imuAngle = 0; imuAngle < 360; imuAngle = imuAngle + 60) {
                            out.println("\t@Test");
                            out.println("\tvoid test" + String.format("%03d", ++i) + "() {");
                            WheelVector.VectorSet set = transform.processNorthUp(
                                    ((double) rotation)/4, ((double) x)/4, ((double) y)/4, imuAngle);
                            out.println("\t\tWheelVector.VectorSet set = transform.processNorthUp("
                                    + ((double) rotation)/4 + ", " + ((double) x)/4 + ", " + ((double) y)/4 + ", " + imuAngle + ");");
                            out.println("\t\tassertTrue(set.equals(new WheelVector.VectorSet(");
                            out.println("                                new WheelVector(" + set.right1.speed + ", " + set.right1.angle + "),");
                            out.println("                                new WheelVector(" + set.right2.speed + ", " + set.right2.angle + "),");
                            out.println("                                new WheelVector(" + set.left1.speed + ", " + set.left1.angle + "),");
                            out.println("                                new WheelVector(" + set.left2.speed + ", " + set.left2.angle + "))));");
                            out.println("\t}");
                            out.println();
                        }
                    }
                }
            }
            out.println("}");
            System.out.println("\n" + i + " tests generated.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void process() {
        SwerveInputTransform transform = new SwerveInputTransform(24, 24);
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
                new WheelVector(1, 90 - Math.atan(2)),
                new WheelVector(1, 90 - Math.atan(2)),
                new WheelVector(1, 90 - Math.atan(2)),
                new WheelVector(1, 90 - Math.atan(2)))));

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