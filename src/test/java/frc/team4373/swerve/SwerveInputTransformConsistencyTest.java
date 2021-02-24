package frc.team4373.swerve;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

class SwerveInputTransformConsistencyTest {
	SwerveInputTransform transform = new SwerveInputTransform(24, 24);

	@Test
	void test001() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test002() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test003() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test004() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test005() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test006() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0),
				new WheelVector(0.0, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test007() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.242640687119285, -135.0),
				new WheelVector(4.242640687119285, 135.0),
				new WheelVector(4.242640687119285, -45.0),
				new WheelVector(4.242640687119285, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test008() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.242640687119285, -135.0),
				new WheelVector(4.242640687119285, 135.0),
				new WheelVector(4.242640687119285, -45.0),
				new WheelVector(4.242640687119285, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test009() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.242640687119285, -135.0),
				new WheelVector(4.242640687119285, 135.0),
				new WheelVector(4.242640687119285, -45.0),
				new WheelVector(4.242640687119285, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test010() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.242640687119285, -135.0),
				new WheelVector(4.242640687119285, 135.0),
				new WheelVector(4.242640687119285, -45.0),
				new WheelVector(4.242640687119285, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test011() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.242640687119285, -135.0),
				new WheelVector(4.242640687119285, 135.0),
				new WheelVector(4.242640687119285, -45.0),
				new WheelVector(4.242640687119285, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test012() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.242640687119285, -135.0),
				new WheelVector(4.242640687119285, 135.0),
				new WheelVector(4.242640687119285, -45.0),
				new WheelVector(4.242640687119285, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test013() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.48528137423857, -135.0),
				new WheelVector(8.48528137423857, 135.0),
				new WheelVector(8.48528137423857, -45.0),
				new WheelVector(8.48528137423857, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test014() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.48528137423857, -135.0),
				new WheelVector(8.48528137423857, 135.0),
				new WheelVector(8.48528137423857, -45.0),
				new WheelVector(8.48528137423857, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test015() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.48528137423857, -135.0),
				new WheelVector(8.48528137423857, 135.0),
				new WheelVector(8.48528137423857, -45.0),
				new WheelVector(8.48528137423857, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test016() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.48528137423857, -135.0),
				new WheelVector(8.48528137423857, 135.0),
				new WheelVector(8.48528137423857, -45.0),
				new WheelVector(8.48528137423857, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test017() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.48528137423857, -135.0),
				new WheelVector(8.48528137423857, 135.0),
				new WheelVector(8.48528137423857, -45.0),
				new WheelVector(8.48528137423857, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test018() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.48528137423857, -135.0),
				new WheelVector(8.48528137423857, 135.0),
				new WheelVector(8.48528137423857, -45.0),
				new WheelVector(8.48528137423857, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test019() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.727922061357855, -135.0),
				new WheelVector(12.727922061357855, 135.0),
				new WheelVector(12.727922061357855, -45.0),
				new WheelVector(12.727922061357855, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test020() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.727922061357855, -135.0),
				new WheelVector(12.727922061357855, 135.0),
				new WheelVector(12.727922061357855, -45.0),
				new WheelVector(12.727922061357855, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test021() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.727922061357855, -135.0),
				new WheelVector(12.727922061357855, 135.0),
				new WheelVector(12.727922061357855, -45.0),
				new WheelVector(12.727922061357855, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test022() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.727922061357855, -135.0),
				new WheelVector(12.727922061357855, 135.0),
				new WheelVector(12.727922061357855, -45.0),
				new WheelVector(12.727922061357855, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test023() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.727922061357855, -135.0),
				new WheelVector(12.727922061357855, 135.0),
				new WheelVector(12.727922061357855, -45.0),
				new WheelVector(12.727922061357855, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test024() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.727922061357855, -135.0),
				new WheelVector(12.727922061357855, 135.0),
				new WheelVector(12.727922061357855, -45.0),
				new WheelVector(12.727922061357855, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test025() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.97056274847714, -135.0),
				new WheelVector(16.97056274847714, 135.0),
				new WheelVector(16.97056274847714, -45.0),
				new WheelVector(16.97056274847714, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test026() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.97056274847714, -135.0),
				new WheelVector(16.97056274847714, 135.0),
				new WheelVector(16.97056274847714, -45.0),
				new WheelVector(16.97056274847714, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test027() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.97056274847714, -135.0),
				new WheelVector(16.97056274847714, 135.0),
				new WheelVector(16.97056274847714, -45.0),
				new WheelVector(16.97056274847714, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test028() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.97056274847714, -135.0),
				new WheelVector(16.97056274847714, 135.0),
				new WheelVector(16.97056274847714, -45.0),
				new WheelVector(16.97056274847714, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test029() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.97056274847714, -135.0),
				new WheelVector(16.97056274847714, 135.0),
				new WheelVector(16.97056274847714, -45.0),
				new WheelVector(16.97056274847714, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test030() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.97056274847714, -135.0),
				new WheelVector(16.97056274847714, 135.0),
				new WheelVector(16.97056274847714, -45.0),
				new WheelVector(16.97056274847714, 45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test031() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, 0.0),
				new WheelVector(0.25, 0.0),
				new WheelVector(0.25, 0.0),
				new WheelVector(0.25, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test032() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, 59.99999999999999),
				new WheelVector(0.25, 59.99999999999999),
				new WheelVector(0.25, 59.99999999999999),
				new WheelVector(0.25, 59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test033() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.24999999999999997, 119.99999999999999),
				new WheelVector(0.24999999999999997, 119.99999999999999),
				new WheelVector(0.24999999999999997, 119.99999999999999),
				new WheelVector(0.24999999999999997, 119.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test034() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, 180.0),
				new WheelVector(0.25, 180.0),
				new WheelVector(0.25, 180.0),
				new WheelVector(0.25, 180.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test035() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, -120.00000000000004),
				new WheelVector(0.25, -120.00000000000004),
				new WheelVector(0.25, -120.00000000000004),
				new WheelVector(0.25, -120.00000000000004));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test036() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, -59.99999999999999),
				new WheelVector(0.25, -59.99999999999999),
				new WheelVector(0.25, -59.99999999999999),
				new WheelVector(0.25, -59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test037() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.0697051490249265, -132.51044707800085),
				new WheelVector(4.0697051490249265, 132.51044707800085),
				new WheelVector(4.422951503238533, -42.70938995736147),
				new WheelVector(4.422951503238533, 42.70938995736147));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test038() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.001682382988853, -135.92647815223074),
				new WheelVector(4.314109190282121, 131.79120232446414),
				new WheelVector(4.184908827480396, -41.69202880239103),
				new WheelVector(4.484588956156033, 45.82670639641315));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test039() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.184908827480396, -138.30797119760896),
				new WheelVector(4.484588956156033, 134.17329360358687),
				new WheelVector(4.001682382988853, -44.07352184776926),
				new WheelVector(4.314109190282121, 48.20879767553586));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test040() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.422951503238533, -137.29061004263855),
				new WheelVector(4.422951503238533, 137.29061004263855),
				new WheelVector(4.0697051490249265, -47.48955292199916),
				new WheelVector(4.0697051490249265, 47.48955292199916));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test041() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.484588956156033, -134.17329360358687),
				new WheelVector(4.184908827480396, 138.30797119760896),
				new WheelVector(4.314109190282121, -48.20879767553586),
				new WheelVector(4.001682382988853, 44.07352184776926));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test042() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.314109190282121, -131.79120232446414),
				new WheelVector(4.001682382988853, 135.92647815223074),
				new WheelVector(4.484588956156033, -45.82670639641315),
				new WheelVector(4.184908827480396, 41.69202880239103));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test043() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.31038506929733, -133.7811247648687),
				new WheelVector(8.31038506929733, 133.7811247648687),
				new WheelVector(8.663861725581729, -43.830860672092584),
				new WheelVector(8.663861725581729, 43.830860672092584));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test044() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.244053844356348, -135.4496996100637),
				new WheelVector(8.553395595396797, 133.38219724576172),
				new WheelVector(8.424038448906005, -43.35734796811013),
				new WheelVector(8.727002704901226, 45.42481294301437));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test045() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.424038448906005, -136.64265203188987),
				new WheelVector(8.727002704901226, 134.5751870569856),
				new WheelVector(8.244053844356348, -44.55030038993632),
				new WheelVector(8.553395595396797, 46.617802754238284));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test046() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.663861725581729, -136.1691393279074),
				new WheelVector(8.663861725581729, 136.1691393279074),
				new WheelVector(8.31038506929733, -46.2188752351313),
				new WheelVector(8.31038506929733, 46.2188752351313));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test047() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.727002704901226, -134.5751870569856),
				new WheelVector(8.424038448906005, 136.64265203188987),
				new WheelVector(8.553395595396797, -46.617802754238284),
				new WheelVector(8.244053844356348, 44.55030038993632));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test048() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.553395595396797, -133.38219724576172),
				new WheelVector(8.244053844356348, 135.4496996100637),
				new WheelVector(8.727002704901226, -45.42481294301437),
				new WheelVector(8.424038448906005, 43.35734796811013));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test049() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.552390210633192, -134.19307054489764),
				new WheelVector(12.552390210633192, 134.19307054489764),
				new WheelVector(12.905909499140307, -44.21517539700811),
				new WheelVector(12.905909499140307, 44.21517539700811));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test050() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.48660825376411, -135.29690419143944),
				new WheelVector(12.79490579555121, 133.91857821906387),
				new WheelVector(12.665519558350933, -43.90752948414245),
				new WheelVector(12.969564923968344, 45.2858480709602));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test051() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.665519558350933, -136.09247051585754),
				new WheelVector(12.969564923968344, 134.71415192903982),
				new WheelVector(12.48660825376411, -44.70309580856056),
				new WheelVector(12.79490579555121, 46.08142178093614));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test052() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.905909499140307, -135.78482460299188),
				new WheelVector(12.905909499140307, 135.78482460299188),
				new WheelVector(12.552390210633192, -45.80692945510237),
				new WheelVector(12.552390210633192, 45.80692945510237));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test053() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.969564923968344, -134.71415192903982),
				new WheelVector(12.665519558350933, 136.09247051585754),
				new WheelVector(12.79490579555121, -46.08142178093614),
				new WheelVector(12.48660825376411, 44.70309580856056));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test054() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.79490579555121, -133.91857821906387),
				new WheelVector(12.48660825376411, 135.29690419143944),
				new WheelVector(12.969564923968344, -45.2858480709602),
				new WheelVector(12.665519558350933, 43.90752948414245));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test055() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.794716431068434, -134.39690880561946),
				new WheelVector(16.794716431068434, 134.39690880561946),
				new WheelVector(17.148250639642516, -44.40934278535333),
				new WheelVector(17.148250639642516, 44.40934278535333));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test056() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.72920642401466, -135.22160758167144),
				new WheelVector(17.03697896995552, 134.18786472459897),
				new WheelVector(16.907582546812936, -44.18164890285751),
				new WheelVector(17.212165826028595, 45.215389423093434));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test057() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.907582546812936, -135.8183510971425),
				new WheelVector(17.212165826028595, 134.7846105769066),
				new WheelVector(16.72920642401466, -44.778392418328586),
				new WheelVector(17.03697896995552, 45.81213527540104));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test058() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.148250639642516, -135.59065721464668),
				new WheelVector(17.148250639642516, 135.59065721464668),
				new WheelVector(16.794716431068434, -45.60309119438054),
				new WheelVector(16.794716431068434, 45.60309119438054));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test059() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.212165826028595, -134.7846105769066),
				new WheelVector(16.907582546812936, 135.8183510971425),
				new WheelVector(17.03697896995552, -45.81213527540104),
				new WheelVector(16.72920642401466, 44.778392418328586));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test060() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.03697896995552, -134.18786472459897),
				new WheelVector(16.72920642401466, 135.22160758167144),
				new WheelVector(17.212165826028595, -45.215389423093434),
				new WheelVector(16.907582546812936, 44.18164890285751));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test061() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, 0.0),
				new WheelVector(0.5, 0.0),
				new WheelVector(0.5, 0.0),
				new WheelVector(0.5, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test062() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, 59.99999999999999),
				new WheelVector(0.5, 59.99999999999999),
				new WheelVector(0.5, 59.99999999999999),
				new WheelVector(0.5, 59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test063() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.49999999999999994, 119.99999999999999),
				new WheelVector(0.49999999999999994, 119.99999999999999),
				new WheelVector(0.49999999999999994, 119.99999999999999),
				new WheelVector(0.49999999999999994, 119.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test064() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, 180.0),
				new WheelVector(0.5, 180.0),
				new WheelVector(0.5, 180.0),
				new WheelVector(0.5, 180.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test065() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, -120.00000000000004),
				new WheelVector(0.5, -120.00000000000004),
				new WheelVector(0.5, -120.00000000000004),
				new WheelVector(0.5, -120.00000000000004));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test066() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, -59.99999999999999),
				new WheelVector(0.5, -59.99999999999999),
				new WheelVector(0.5, -59.99999999999999),
				new WheelVector(0.5, -59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test067() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.905124837953327, -129.8055710922652),
				new WheelVector(3.905124837953327, 129.8055710922652),
				new WheelVector(4.6097722286464435, -40.60129464500447),
				new WheelVector(4.6097722286464435, 40.60129464500447));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test068() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.7619042769117192, -136.97136398626915),
				new WheelVector(4.398644815321341, 128.69632203054232),
				new WheelVector(4.141488112822091, -38.30316980391358),
				new WheelVector(4.727375192572863, 46.568639154233594));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test069() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.141488112822091, -141.6968301960864),
				new WheelVector(4.727375192572863, 133.43136084576642),
				new WheelVector(3.7619042769117192, -43.02863601373084),
				new WheelVector(4.398644815321341, 51.30367796945768));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test070() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.6097722286464435, -139.3987053549955),
				new WheelVector(4.6097722286464435, 139.3987053549955),
				new WheelVector(3.905124837953327, -50.19442890773481),
				new WheelVector(3.905124837953327, 50.19442890773481));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test071() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.727375192572863, -133.43136084576642),
				new WheelVector(4.141488112822091, 141.6968301960864),
				new WheelVector(4.398644815321341, -51.30367796945768),
				new WheelVector(3.7619042769117192, 43.02863601373084));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test072() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.398644815321341, -128.69632203054232),
				new WheelVector(3.7619042769117192, 136.97136398626915),
				new WheelVector(4.727375192572863, -46.568639154233594),
				new WheelVector(4.141488112822091, 38.30316980391358));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test073() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.139410298049853, -132.51044707800085),
				new WheelVector(8.139410298049853, 132.51044707800085),
				new WheelVector(8.845903006477066, -42.70938995736147),
				new WheelVector(8.845903006477066, 42.70938995736147));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test074() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.003364765977706, -135.92647815223074),
				new WheelVector(8.628218380564242, 131.79120232446414),
				new WheelVector(8.369817654960793, -41.69202880239103),
				new WheelVector(8.969177912312066, 45.82670639641315));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test075() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.369817654960793, -138.30797119760896),
				new WheelVector(8.969177912312066, 134.17329360358687),
				new WheelVector(8.003364765977706, -44.07352184776926),
				new WheelVector(8.628218380564242, 48.20879767553586));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test076() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.845903006477066, -137.29061004263855),
				new WheelVector(8.845903006477066, 137.29061004263855),
				new WheelVector(8.139410298049853, -47.48955292199916),
				new WheelVector(8.139410298049853, 47.48955292199916));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test077() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.969177912312066, -134.17329360358687),
				new WheelVector(8.369817654960793, 138.30797119760896),
				new WheelVector(8.628218380564242, -48.20879767553586),
				new WheelVector(8.003364765977706, 44.07352184776926));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test078() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.628218380564242, -131.79120232446414),
				new WheelVector(8.003364765977706, 135.92647815223074),
				new WheelVector(8.969177912312066, -45.82670639641315),
				new WheelVector(8.369817654960793, 41.69202880239103));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test079() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.379418403139947, -133.36342295838327),
				new WheelVector(12.379418403139947, 133.36342295838327),
				new WheelVector(13.0862523283024, -43.45184230102204),
				new WheelVector(13.0862523283024, 43.45184230102204));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test080() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.24564295437116, -135.6055016885919),
				new WheelVector(12.866399210115468, 132.84879681251923),
				new WheelVector(12.607766311521642, -42.80464612044303),
				new WheelVector(13.211518786046513, 45.561232827458795));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test081() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.607766311521642, -137.195353879557),
				new WheelVector(13.211518786046513, 134.43876717254122),
				new WheelVector(12.24564295437116, -44.394498311408114),
				new WheelVector(12.866399210115468, 47.151203187480775));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test082() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.0862523283024, -136.54815769897795),
				new WheelVector(13.0862523283024, 136.54815769897795),
				new WheelVector(12.379418403139947, -46.63657704161672),
				new WheelVector(12.379418403139947, 46.63657704161672));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test083() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.211518786046513, -134.43876717254122),
				new WheelVector(12.607766311521642, 137.195353879557),
				new WheelVector(12.866399210115468, -47.151203187480775),
				new WheelVector(12.24564295437116, 44.394498311408114));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test084() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.866399210115468, -132.84879681251923),
				new WheelVector(12.24564295437116, 135.6055016885919),
				new WheelVector(13.211518786046513, -45.561232827458795),
				new WheelVector(12.607766311521642, 42.80464612044303));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test085() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.62077013859466, -133.7811247648687),
				new WheelVector(16.62077013859466, 133.7811247648687),
				new WheelVector(17.327723451163457, -43.830860672092584),
				new WheelVector(17.327723451163457, 43.830860672092584));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test086() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.488107688712695, -135.4496996100637),
				new WheelVector(17.106791190793594, 133.38219724576172),
				new WheelVector(16.84807689781201, -43.35734796811013),
				new WheelVector(17.454005409802452, 45.42481294301437));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test087() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.84807689781201, -136.64265203188987),
				new WheelVector(17.454005409802452, 134.5751870569856),
				new WheelVector(16.488107688712695, -44.55030038993632),
				new WheelVector(17.106791190793594, 46.617802754238284));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test088() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.327723451163457, -136.1691393279074),
				new WheelVector(17.327723451163457, 136.1691393279074),
				new WheelVector(16.62077013859466, -46.2188752351313),
				new WheelVector(16.62077013859466, 46.2188752351313));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test089() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.454005409802452, -134.5751870569856),
				new WheelVector(16.84807689781201, 136.64265203188987),
				new WheelVector(17.106791190793594, -46.617802754238284),
				new WheelVector(16.488107688712695, 44.55030038993632));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test090() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.106791190793594, -133.38219724576172),
				new WheelVector(16.488107688712695, 135.4496996100637),
				new WheelVector(17.454005409802452, -45.42481294301437),
				new WheelVector(16.84807689781201, 43.35734796811013));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test091() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.75, 0.0),
				new WheelVector(0.75, 0.0),
				new WheelVector(0.75, 0.0),
				new WheelVector(0.75, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test092() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7500000000000001, 59.99999999999999),
				new WheelVector(0.7500000000000001, 59.99999999999999),
				new WheelVector(0.7500000000000001, 59.99999999999999),
				new WheelVector(0.7500000000000001, 59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test093() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7499999999999999, 119.99999999999999),
				new WheelVector(0.7499999999999999, 119.99999999999999),
				new WheelVector(0.7499999999999999, 119.99999999999999),
				new WheelVector(0.7499999999999999, 119.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test094() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.75, 180.0),
				new WheelVector(0.75, 180.0),
				new WheelVector(0.75, 180.0),
				new WheelVector(0.75, 180.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test095() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.75, -120.00000000000004),
				new WheelVector(0.75, -120.00000000000004),
				new WheelVector(0.75, -120.00000000000004),
				new WheelVector(0.75, -120.00000000000004));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test096() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7500000000000001, -59.99999999999999),
				new WheelVector(0.7500000000000001, -59.99999999999999),
				new WheelVector(0.7500000000000001, -59.99999999999999),
				new WheelVector(0.7500000000000001, -59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test097() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.75, -126.86989764584402),
				new WheelVector(3.75, 126.86989764584402),
				new WheelVector(4.802343178074636, -38.65980825409009),
				new WheelVector(4.802343178074636, 38.65980825409009));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test098() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.523547315273349, -138.15805683869274),
				new WheelVector(4.495510462342399, 125.72643959502184),
				new WheelVector(4.112831832566222, -34.854850177513924),
				new WheelVector(4.970876614544961, 47.23798711952761));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test099() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.112831832566222, -145.14514982248608),
				new WheelVector(4.970876614544961, 132.76201288047238),
				new WheelVector(3.523547315273349, -41.841943161307256),
				new WheelVector(4.495510462342399, 54.273560404978156));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test100() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.802343178074636, -141.34019174590992),
				new WheelVector(4.802343178074636, 141.34019174590992),
				new WheelVector(3.75, -53.13010235415599),
				new WheelVector(3.75, 53.13010235415599));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test101() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.970876614544961, -132.76201288047238),
				new WheelVector(4.112831832566222, 145.14514982248608),
				new WheelVector(4.495510462342399, -54.27356040497816),
				new WheelVector(3.523547315273349, 41.841943161307256));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test102() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.495510462342399, -125.72643959502184),
				new WheelVector(3.523547315273349, 138.15805683869274),
				new WheelVector(4.970876614544961, -47.23798711952761),
				new WheelVector(4.112831832566222, 34.854850177513924));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test103() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.9726093595509875, -131.18592516570965),
				new WheelVector(7.9726093595509875, 131.18592516570965),
				new WheelVector(9.031195934094221, -41.6335393365702),
				new WheelVector(9.031195934094221, 41.6335393365702));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test104() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.763264221056762, -136.43278499100336),
				new WheelVector(8.709576834385237, 130.22874446523232),
				new WheelVector(8.322756236123947, -40.006438035673014),
				new WheelVector(9.211771199615194, 46.2074499289454));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test105() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.322756236123947, -139.99356196432697),
				new WheelVector(9.211771199615194, 133.7925500710546),
				new WheelVector(7.763264221056762, -43.567215008996655),
				new WheelVector(8.709576834385237, 49.771255534767704));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test106() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.031195934094221, -138.3664606634298),
				new WheelVector(9.031195934094221, 138.3664606634298),
				new WheelVector(7.9726093595509875, -48.81407483429036),
				new WheelVector(7.9726093595509875, 48.81407483429036));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test107() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.211771199615194, -133.7925500710546),
				new WheelVector(8.322756236123947, 139.99356196432697),
				new WheelVector(8.709576834385237, -49.771255534767704),
				new WheelVector(7.763264221056762, 43.567215008996655));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test108() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.709576834385237, -130.22874446523232),
				new WheelVector(7.763264221056762, 136.43278499100336),
				new WheelVector(9.211771199615194, -46.2074499289454),
				new WheelVector(8.322756236123947, 40.006438035673014));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test109() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.20911544707478, -132.51044707800085),
				new WheelVector(12.20911544707478, 132.51044707800085),
				new WheelVector(13.268854509715599, -42.70938995736147),
				new WheelVector(13.268854509715599, 42.70938995736147));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test110() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.005047148966558, -135.92647815223074),
				new WheelVector(12.942327570846363, 131.79120232446414),
				new WheelVector(12.554726482441188, -41.69202880239103),
				new WheelVector(13.453766868468099, 45.82670639641315));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test111() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.554726482441188, -138.30797119760896),
				new WheelVector(13.453766868468099, 134.17329360358687),
				new WheelVector(12.005047148966558, -44.07352184776926),
				new WheelVector(12.942327570846363, 48.20879767553586));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test112() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.268854509715599, -137.29061004263855),
				new WheelVector(13.268854509715599, 137.29061004263855),
				new WheelVector(12.20911544707478, -47.48955292199916),
				new WheelVector(12.20911544707478, 47.48955292199916));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test113() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.453766868468099, -134.17329360358687),
				new WheelVector(12.554726482441188, 138.30797119760896),
				new WheelVector(12.942327570846363, -48.20879767553586),
				new WheelVector(12.005047148966558, 44.07352184776926));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test114() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.942327570846363, -131.79120232446414),
				new WheelVector(12.005047148966558, 135.92647815223074),
				new WheelVector(13.453766868468099, -45.82670639641315),
				new WheelVector(12.554726482441188, 41.69202880239103));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test115() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.44878414959598, -133.1523897340054),
				new WheelVector(16.44878414959598, 133.1523897340054),
				new WheelVector(17.50892629489313, -43.264295411071615),
				new WheelVector(17.50892629489313, 43.264295411071615));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test116() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.247278009927697, -135.684557364766),
				new WheelVector(17.179958011244377, 132.58323531661276),
				new WheelVector(16.792082739549613, -42.52737690669411),
				new WheelVector(17.696071803316123, 45.628509670731624));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test117() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.792082739549613, -137.47262309330588),
				new WheelVector(17.696071803316123, 134.37149032926837),
				new WheelVector(16.247278009927697, -44.31544263523401),
				new WheelVector(17.179958011244377, 47.41676468338724));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test118() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.50892629489313, -136.7357045889284),
				new WheelVector(17.50892629489313, 136.7357045889284),
				new WheelVector(16.44878414959598, -46.8476102659946),
				new WheelVector(16.44878414959598, 46.8476102659946));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test119() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.696071803316123, -134.37149032926837),
				new WheelVector(16.792082739549613, 137.47262309330588),
				new WheelVector(17.179958011244377, -47.41676468338724),
				new WheelVector(16.247278009927697, 44.31544263523401));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test120() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.179958011244377, -132.58323531661276),
				new WheelVector(16.247278009927697, 135.684557364766),
				new WheelVector(17.696071803316123, -45.628509670731624),
				new WheelVector(16.792082739549613, 42.52737690669411));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test121() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, 0.0),
				new WheelVector(1.0, 0.0),
				new WheelVector(1.0, 0.0),
				new WheelVector(1.0, 0.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test122() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, 59.99999999999999),
				new WheelVector(1.0, 59.99999999999999),
				new WheelVector(1.0, 59.99999999999999),
				new WheelVector(1.0, 59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test123() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9999999999999999, 119.99999999999999),
				new WheelVector(0.9999999999999999, 119.99999999999999),
				new WheelVector(0.9999999999999999, 119.99999999999999),
				new WheelVector(0.9999999999999999, 119.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test124() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, 180.0),
				new WheelVector(1.0, 180.0),
				new WheelVector(1.0, 180.0),
				new WheelVector(1.0, 180.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test125() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, -120.00000000000004),
				new WheelVector(1.0, -120.00000000000004),
				new WheelVector(1.0, -120.00000000000004),
				new WheelVector(1.0, -120.00000000000004));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test126() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, -59.99999999999999),
				new WheelVector(1.0, -59.99999999999999),
				new WheelVector(1.0, -59.99999999999999),
				new WheelVector(1.0, -59.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test127() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.605551275463989, -123.6900675259798),
				new WheelVector(3.605551275463989, 123.6900675259798),
				new WheelVector(5.0, -36.86989764584401),
				new WheelVector(5.0, 36.86989764584401));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test128() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.2869206831460613, -139.5162654116459),
				new WheelVector(4.60392793413479, 122.88909121976268),
				new WheelVector(4.099249635883788, -31.370955596326535),
				new WheelVector(5.21499304148209, 47.84474653611086));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test129() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.099249635883788, -148.62904440367348),
				new WheelVector(5.214993041482091, 132.15525346388915),
				new WheelVector(3.286920683146061, -40.48373458835411),
				new WheelVector(4.60392793413479, 57.11090878023734));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test130() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.0, -143.13010235415598),
				new WheelVector(5.0, 143.13010235415598),
				new WheelVector(3.605551275463989, -56.309932474020215),
				new WheelVector(3.605551275463989, 56.309932474020215));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test131() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.214993041482091, -132.15525346388915),
				new WheelVector(4.099249635883789, 148.62904440367348),
				new WheelVector(4.60392793413479, -57.11090878023734),
				new WheelVector(3.286920683146061, 40.48373458835412));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test132() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.60392793413479, -122.88909121976268),
				new WheelVector(3.2869206831460613, 139.5162654116459),
				new WheelVector(5.21499304148209, -47.84474653611086),
				new WheelVector(4.099249635883788, 31.370955596326535));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test133() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.810249675906654, -129.8055710922652),
				new WheelVector(7.810249675906654, 129.8055710922652),
				new WheelVector(9.219544457292887, -40.60129464500447),
				new WheelVector(9.219544457292887, 40.60129464500447));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test134() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.5238085538234385, -136.97136398626915),
				new WheelVector(8.797289630642682, 128.69632203054232),
				new WheelVector(8.282976225644182, -38.30316980391358),
				new WheelVector(9.454750385145726, 46.568639154233594));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test135() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.282976225644182, -141.6968301960864),
				new WheelVector(9.454750385145726, 133.43136084576642),
				new WheelVector(7.5238085538234385, -43.02863601373084),
				new WheelVector(8.797289630642682, 51.30367796945768));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test136() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.219544457292887, -139.3987053549955),
				new WheelVector(9.219544457292887, 139.3987053549955),
				new WheelVector(7.810249675906654, -50.19442890773481),
				new WheelVector(7.810249675906654, 50.19442890773481));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test137() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.454750385145726, -133.43136084576642),
				new WheelVector(8.282976225644182, 141.6968301960864),
				new WheelVector(8.797289630642682, -51.30367796945768),
				new WheelVector(7.5238085538234385, 43.02863601373084));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test138() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.797289630642682, -128.69632203054232),
				new WheelVector(7.5238085538234385, 136.97136398626915),
				new WheelVector(9.454750385145726, -46.568639154233594),
				new WheelVector(8.282976225644182, 38.30316980391358));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test139() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.041594578792296, -131.63353933657018),
				new WheelVector(12.041594578792296, 131.63353933657018),
				new WheelVector(13.45362404707371, -41.98721249581666),
				new WheelVector(13.45362404707371, 41.98721249581666));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test140() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.764843506476408, -136.26057225922622),
				new WheelVector(13.022613304099908, 130.74629573479473),
				new WheelVector(12.506460039990538, -40.57039778625456),
				new WheelVector(13.696293559504333, 46.08278357200523));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test141() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.506460039990538, -139.42960221374545),
				new WheelVector(13.696293559504333, 133.9172164279948),
				new WheelVector(11.764843506476408, -43.73942774077379),
				new WheelVector(13.022613304099908, 49.25370426520528));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test142() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.45362404707371, -138.01278750418336),
				new WheelVector(13.45362404707371, 138.01278750418336),
				new WheelVector(12.041594578792296, -48.3664606634298),
				new WheelVector(12.041594578792296, 48.3664606634298));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test143() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.696293559504333, -133.9172164279948),
				new WheelVector(12.506460039990538, 139.42960221374545),
				new WheelVector(13.022613304099906, -49.25370426520527),
				new WheelVector(11.76484350647641, 43.7394277407738));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test144() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.022613304099908, -130.74629573479473),
				new WheelVector(11.764843506476408, 136.26057225922622),
				new WheelVector(13.696293559504333, -46.08278357200523),
				new WheelVector(12.506460039990538, 40.57039778625456));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test145() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.278820596099706, -132.51044707800085),
				new WheelVector(16.278820596099706, 132.51044707800085),
				new WheelVector(17.69180601295413, -42.70938995736147),
				new WheelVector(17.69180601295413, 42.70938995736147));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test146() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.00672953195541, -135.92647815223074),
				new WheelVector(17.256436761128484, 131.79120232446414),
				new WheelVector(16.739635309921585, -41.69202880239103),
				new WheelVector(17.938355824624132, 45.82670639641315));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test147() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.739635309921585, -138.30797119760896),
				new WheelVector(17.938355824624132, 134.17329360358687),
				new WheelVector(16.00672953195541, -44.07352184776926),
				new WheelVector(17.256436761128484, 48.20879767553586));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test148() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.69180601295413, -137.29061004263855),
				new WheelVector(17.69180601295413, 137.29061004263855),
				new WheelVector(16.278820596099706, -47.48955292199916),
				new WheelVector(16.278820596099706, 47.48955292199916));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test149() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.938355824624132, -134.17329360358687),
				new WheelVector(16.739635309921585, 138.30797119760896),
				new WheelVector(17.256436761128484, -48.20879767553586),
				new WheelVector(16.00672953195541, 44.07352184776926));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test150() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.256436761128484, -131.79120232446414),
				new WheelVector(16.00672953195541, 135.92647815223074),
				new WheelVector(17.938355824624132, -45.82670639641315),
				new WheelVector(16.739635309921585, 41.69202880239103));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test151() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, -90.0),
				new WheelVector(0.25, -90.0),
				new WheelVector(0.25, -90.0),
				new WheelVector(0.25, -90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test152() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, -30.00000000000001),
				new WheelVector(0.25, -30.00000000000001),
				new WheelVector(0.25, -30.00000000000001),
				new WheelVector(0.25, -30.00000000000001));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test153() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.24999999999999997, 29.999999999999993),
				new WheelVector(0.24999999999999997, 29.999999999999993),
				new WheelVector(0.24999999999999997, 29.999999999999993),
				new WheelVector(0.24999999999999997, 29.999999999999993));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test154() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, 90.0),
				new WheelVector(0.25, 90.0),
				new WheelVector(0.25, 90.0),
				new WheelVector(0.25, 90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test155() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, 149.99999999999997),
				new WheelVector(0.25, 149.99999999999997),
				new WheelVector(0.25, 149.99999999999997),
				new WheelVector(0.25, 149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test156() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.25, -149.99999999999997),
				new WheelVector(0.25, -149.99999999999997),
				new WheelVector(0.25, -149.99999999999997),
				new WheelVector(0.25, -149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test157() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.422951503238533, -132.70938995736148),
				new WheelVector(4.0697051490249265, 137.48955292199915),
				new WheelVector(4.422951503238533, -47.29061004263853),
				new WheelVector(4.0697051490249265, 42.510447078000844));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test158() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.184908827480396, -131.69202880239104),
				new WheelVector(4.001682382988853, 134.07352184776926),
				new WheelVector(4.484588956156033, -44.173293603586856),
				new WheelVector(4.314109190282121, 41.79120232446414));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test159() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.001682382988853, -134.07352184776926),
				new WheelVector(4.184908827480396, 131.69202880239104),
				new WheelVector(4.314109190282121, -41.79120232446414),
				new WheelVector(4.484588956156033, 44.173293603586856));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test160() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.0697051490249265, -137.48955292199915),
				new WheelVector(4.422951503238533, 132.70938995736148),
				new WheelVector(4.0697051490249265, -42.510447078000844),
				new WheelVector(4.422951503238533, 47.29061004263853));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test161() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.314109190282121, -138.20879767553586),
				new WheelVector(4.484588956156033, 135.82670639641313),
				new WheelVector(4.001682382988853, -45.92647815223074),
				new WheelVector(4.184908827480396, 48.30797119760897));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test162() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.484588956156033, -135.82670639641313),
				new WheelVector(4.314109190282121, 138.20879767553586),
				new WheelVector(4.184908827480396, -48.30797119760897),
				new WheelVector(4.001682382988853, 45.92647815223074));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test163() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.663861725581729, -133.8308606720926),
				new WheelVector(8.31038506929733, 136.21887523513132),
				new WheelVector(8.663861725581729, -46.169139327907416),
				new WheelVector(8.31038506929733, 43.78112476486871));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test164() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.424038448906005, -133.35734796811013),
				new WheelVector(8.244053844356348, 134.5503003899363),
				new WheelVector(8.727002704901226, -44.57518705698563),
				new WheelVector(8.553395595396797, 43.38219724576172));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test165() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.244053844356348, -134.5503003899363),
				new WheelVector(8.424038448906005, 133.35734796811013),
				new WheelVector(8.553395595396797, -43.38219724576172),
				new WheelVector(8.727002704901226, 44.57518705698563));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test166() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.31038506929733, -136.21887523513132),
				new WheelVector(8.663861725581729, 133.8308606720926),
				new WheelVector(8.31038506929733, -43.78112476486871),
				new WheelVector(8.663861725581729, 46.169139327907416));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test167() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.553395595396797, -136.61780275423828),
				new WheelVector(8.727002704901226, 135.4248129430144),
				new WheelVector(8.244053844356348, -45.44969961006369),
				new WheelVector(8.424038448906005, 46.642652031889874));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test168() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.727002704901226, -135.4248129430144),
				new WheelVector(8.553395595396797, 136.61780275423828),
				new WheelVector(8.424038448906005, -46.642652031889874),
				new WheelVector(8.244053844356348, 45.44969961006369));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test169() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.905909499140307, -134.2151753970081),
				new WheelVector(12.552390210633192, 135.8069294551024),
				new WheelVector(12.905909499140307, -45.7848246029919),
				new WheelVector(12.552390210633192, 44.19307054489763));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test170() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.665519558350933, -133.90752948414246),
				new WheelVector(12.48660825376411, 134.7030958085606),
				new WheelVector(12.969564923968344, -44.714151929039794),
				new WheelVector(12.79490579555121, 43.91857821906387));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test171() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.48660825376411, -134.7030958085606),
				new WheelVector(12.665519558350933, 133.90752948414246),
				new WheelVector(12.79490579555121, -43.91857821906387),
				new WheelVector(12.969564923968344, 44.714151929039794));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test172() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.552390210633192, -135.8069294551024),
				new WheelVector(12.905909499140307, 134.2151753970081),
				new WheelVector(12.552390210633192, -44.19307054489763),
				new WheelVector(12.905909499140307, 45.7848246029919));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test173() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.79490579555121, -136.08142178093613),
				new WheelVector(12.969564923968344, 135.2858480709602),
				new WheelVector(12.48660825376411, -45.29690419143944),
				new WheelVector(12.665519558350933, 46.092470515857556));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test174() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.969564923968344, -135.2858480709602),
				new WheelVector(12.79490579555121, 136.08142178093613),
				new WheelVector(12.665519558350933, -46.092470515857556),
				new WheelVector(12.48660825376411, 45.29690419143944));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test175() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.148250639642516, -134.40934278535332),
				new WheelVector(16.794716431068434, 135.60309119438054),
				new WheelVector(17.148250639642516, -45.590657214646676),
				new WheelVector(16.794716431068434, 44.39690880561947));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test176() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.907582546812936, -134.18164890285752),
				new WheelVector(16.72920642401466, 134.77839241832856),
				new WheelVector(17.212165826028595, -44.784610576906566),
				new WheelVector(17.03697896995552, 44.18786472459896));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test177() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.72920642401466, -134.77839241832856),
				new WheelVector(16.907582546812936, 134.18164890285752),
				new WheelVector(17.03697896995552, -44.18786472459896),
				new WheelVector(17.212165826028595, 44.784610576906566));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test178() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.794716431068434, -135.60309119438054),
				new WheelVector(17.148250639642516, 134.40934278535332),
				new WheelVector(16.794716431068434, -44.39690880561947),
				new WheelVector(17.148250639642516, 45.590657214646676));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test179() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.03697896995552, -135.81213527540103),
				new WheelVector(17.212165826028595, 135.21538942309343),
				new WheelVector(16.72920642401466, -45.22160758167142),
				new WheelVector(16.907582546812936, 45.81835109714249));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test180() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.212165826028595, -135.21538942309343),
				new WheelVector(17.03697896995552, 135.81213527540103),
				new WheelVector(16.907582546812936, -45.81835109714249),
				new WheelVector(16.72920642401466, 45.22160758167142));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test181() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.3535533905932738, -45.0),
				new WheelVector(0.3535533905932738, -45.0),
				new WheelVector(0.3535533905932738, -45.0),
				new WheelVector(0.3535533905932738, -45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test182() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.3535533905932738, 14.999999999999996),
				new WheelVector(0.3535533905932738, 14.999999999999996),
				new WheelVector(0.3535533905932738, 14.999999999999996),
				new WheelVector(0.3535533905932738, 14.999999999999996));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test183() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.35355339059327373, 74.99999999999999),
				new WheelVector(0.35355339059327373, 74.99999999999999),
				new WheelVector(0.35355339059327373, 74.99999999999999),
				new WheelVector(0.35355339059327373, 74.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test184() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.3535533905932738, 135.0),
				new WheelVector(0.3535533905932738, 135.0),
				new WheelVector(0.3535533905932738, 135.0),
				new WheelVector(0.3535533905932738, 135.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test185() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.3535533905932738, -165.00000000000003),
				new WheelVector(0.3535533905932738, -165.00000000000003),
				new WheelVector(0.3535533905932738, -165.00000000000003),
				new WheelVector(0.3535533905932738, -165.00000000000003));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test186() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.3535533905932738, -105.0),
				new WheelVector(0.3535533905932738, -105.0),
				new WheelVector(0.3535533905932738, -105.0),
				new WheelVector(0.3535533905932738, -105.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test187() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.257346591481601, -130.2363583092738),
				new WheelVector(3.8890872965260113, 135.0),
				new WheelVector(4.596194077712559, -45.0),
				new WheelVector(4.257346591481601, 40.23635830927382));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test188() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.940421778013958, -132.4287120211297),
				new WheelVector(4.077376607575022, 130.69338090449855),
				new WheelVector(4.430011286667337, -41.03676503255021),
				new WheelVector(4.55226056057354, 42.77448901203475));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test189() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.9404217780139583, -137.5712879788703),
				new WheelVector(4.430011286667337, 131.03676503255022),
				new WheelVector(4.077376607575023, -40.69338090449856),
				new WheelVector(4.552260560573539, 47.22551098796526));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test190() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.257346591481601, -139.7636416907262),
				new WheelVector(4.596194077712559, 135.0),
				new WheelVector(3.8890872965260113, -45.0),
				new WheelVector(4.257346591481601, 49.76364169072618));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test191() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.552260560573539, -137.22551098796527),
				new WheelVector(4.430011286667338, 138.9632349674498),
				new WheelVector(4.077376607575022, -49.306619095501446),
				new WheelVector(3.9404217780139583, 47.57128797887031));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test192() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.55226056057354, -132.77448901203476),
				new WheelVector(4.077376607575022, 139.30661909550145),
				new WheelVector(4.430011286667337, -48.963234967449786),
				new WheelVector(3.940421778013958, 42.4287120211297));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test193() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.492643875731515, -132.6140559696112),
				new WheelVector(8.131727983645296, 135.0),
				new WheelVector(8.838834764831844, -45.0),
				new WheelVector(8.492643875731515, 42.61405596961119));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test194() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.18100529136202, -133.761845695539),
				new WheelVector(8.314144574157945, 132.8894827063081),
				new WheelVector(8.667467911679857, -42.975553067563),
				new WheelVector(8.793244703902344, 43.84806561410308));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test195() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.18100529136202, -136.238154304461),
				new WheelVector(8.667467911679857, 132.975553067563),
				new WheelVector(8.314144574157945, -42.8894827063081),
				new WheelVector(8.793244703902344, 46.15193438589693));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test196() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.492643875731515, -137.38594403038883),
				new WheelVector(8.838834764831844, 135.0),
				new WheelVector(8.131727983645296, -45.0),
				new WheelVector(8.492643875731515, 47.385944030388806));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test197() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.793244703902344, -136.1519343858969),
				new WheelVector(8.667467911679857, 137.024446932437),
				new WheelVector(8.314144574157945, -47.110517293691906),
				new WheelVector(8.18100529136202, 46.23815430446101));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test198() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.793244703902344, -133.8480656141031),
				new WheelVector(8.314144574157945, 137.1105172936919),
				new WheelVector(8.667467911679857, -47.024446932437),
				new WheelVector(8.18100529136202, 43.76184569553899));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test199() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.732831578246843, -133.40885972880542),
				new WheelVector(12.374368670764582, 135.0),
				new WheelVector(13.08147545195113, -45.0),
				new WheelVector(12.732831578246843, 43.40885972880541));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test200() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.422993655554205, -134.18466509072317),
				new WheelVector(12.55487952948972, 133.60254194660925),
				new WheelVector(12.908330643425586, -43.64081390434785),
				new WheelVector(13.035307001910617, 44.22296659068203));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test201() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.422993655554205, -135.81533490927683),
				new WheelVector(12.908330643425586, 133.64081390434788),
				new WheelVector(12.55487952948972, -43.60254194660926),
				new WheelVector(13.035307001910617, 45.77703340931797));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test202() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.732831578246843, -136.59114027119458),
				new WheelVector(13.08147545195113, 135.0),
				new WheelVector(12.374368670764582, -45.0),
				new WheelVector(12.732831578246843, 46.59114027119459));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test203() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.035307001910617, -135.77703340931797),
				new WheelVector(12.908330643425586, 136.35918609565215),
				new WheelVector(12.55487952948972, -46.39745805339075),
				new WheelVector(12.422993655554205, 45.81533490927683));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test204() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.035307001910617, -134.22296659068203),
				new WheelVector(12.55487952948972, 136.39745805339075),
				new WheelVector(12.908330643425586, -46.35918609565215),
				new WheelVector(12.422993655554205, 44.18466509072317));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test205() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.974245196767956, -133.80651057601796),
				new WheelVector(16.617009357883866, 135.0),
				new WheelVector(17.324116139070416, -45.0),
				new WheelVector(16.974245196767956, 43.80651057601797));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test206() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.665314133090522, -134.39222576743552),
				new WheelVector(16.796577032240826, 133.95549255436688),
				new WheelVector(17.150072886142496, -43.97702416567179),
				new WheelVector(17.277653337343395, 44.413766726085434));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test207() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.665314133090522, -135.6077742325645),
				new WheelVector(17.150072886142496, 133.9770241656718),
				new WheelVector(16.796577032240826, -43.95549255436689),
				new WheelVector(17.277653337343395, 45.58623327391457));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test208() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.974245196767956, -136.19348942398204),
				new WheelVector(17.324116139070416, 135.0),
				new WheelVector(16.617009357883866, -45.0),
				new WheelVector(16.974245196767956, 46.19348942398204));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test209() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.277653337343395, -135.58623327391456),
				new WheelVector(17.150072886142496, 136.0229758343282),
				new WheelVector(16.796577032240826, -46.044507445633116),
				new WheelVector(16.665314133090522, 45.607774232564495));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test210() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.277653337343395, -134.41376672608544),
				new WheelVector(16.796577032240826, 136.04450744563312),
				new WheelVector(17.150072886142496, -46.022975834328214),
				new WheelVector(16.665314133090522, 44.392225767435505));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test211() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, -26.56505117707799),
				new WheelVector(0.5590169943749475, -26.56505117707799),
				new WheelVector(0.5590169943749475, -26.56505117707799),
				new WheelVector(0.5590169943749475, -26.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test212() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, 33.43494882292201),
				new WheelVector(0.5590169943749475, 33.43494882292201),
				new WheelVector(0.5590169943749475, 33.43494882292201),
				new WheelVector(0.5590169943749475, 33.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test213() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749473, 93.43494882292201),
				new WheelVector(0.5590169943749473, 93.43494882292201),
				new WheelVector(0.5590169943749473, 93.43494882292201),
				new WheelVector(0.5590169943749473, 93.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test214() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, 153.434948822922),
				new WheelVector(0.5590169943749475, 153.434948822922),
				new WheelVector(0.5590169943749475, 153.434948822922),
				new WheelVector(0.5590169943749475, 153.434948822922));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test215() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, -146.56505117707803),
				new WheelVector(0.5590169943749475, -146.56505117707803),
				new WheelVector(0.5590169943749475, -146.56505117707803),
				new WheelVector(0.5590169943749475, -146.56505117707803));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test216() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, -86.56505117707799),
				new WheelVector(0.5590169943749475, -86.56505117707799),
				new WheelVector(0.5590169943749475, -86.56505117707799),
				new WheelVector(0.5590169943749475, -86.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test217() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.100304866714182, -127.56859202882751),
				new WheelVector(3.7165171868296265, 132.27368900609375),
				new WheelVector(4.7762432936357, -42.87890360333855),
				new WheelVector(4.451123453691214, 38.15722658736907));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test218() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.69667224446123, -133.26269886739138),
				new WheelVector(4.16671790569948, 127.44726711130879),
				new WheelVector(4.389016050816326, -37.831866505595755),
				new WheelVector(4.791619174875021, 43.65977779299746));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test219() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.894276015252389, -141.1656495512154),
				new WheelVector(4.67563237494958, 130.45027597072922),
				new WheelVector(3.842325063594092, -39.460742606699796),
				new WheelVector(4.63245230056716, 50.18021669560388));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test220() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.451123453691214, -141.84277341263095),
				new WheelVector(4.7762432936357, 137.12109639666144),
				new WheelVector(3.7165171868296265, -47.72631099390627),
				new WheelVector(4.100304866714182, 52.431407971172504));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test221() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.791619174875021, -136.34022220700254),
				new WheelVector(4.389016050816326, 142.16813349440426),
				new WheelVector(4.16671790569948, -52.552732888691196),
				new WheelVector(3.69667224446123, 46.73730113260864));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test222() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.632452300567159, -129.81978330439614),
				new WheelVector(3.8423250635940915, 140.5392573933002),
				new WheelVector(4.675632374949581, -49.54972402927078),
				new WheelVector(3.894276015252389, 38.83435044878458));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test223() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.325412902673357, -131.34777721969368),
				new WheelVector(7.956915231419774, 133.7269699799433),
				new WheelVector(9.017344398435716, -43.87669728592458),
				new WheelVector(8.678277478854891, 41.49646835521554));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test224() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.93840483761946, -134.1910891074421),
				new WheelVector(8.391101013058615, 131.25777743257206),
				new WheelVector(8.61477938131016, -41.35507538526765),
				new WheelVector(9.033644260986812, 44.28916687847683));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test225() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.125162851656578, -137.95071295175657),
				new WheelVector(8.911261202060757, 132.61463306788622),
				new WheelVector(8.075544798256443, -42.36761219402198),
				new WheelVector(8.866043572758931, 47.703948430012915));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test226() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.678277478854891, -138.50353164478446),
				new WheelVector(9.017344398435716, 136.12330271407544),
				new WheelVector(7.956915231419774, -46.27303002005671),
				new WheelVector(8.325412902673357, 48.65222278030633));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test227() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.033644260986812, -135.7108331215232),
				new WheelVector(8.614779381310163, 138.64492461473236),
				new WheelVector(8.391101013058615, -48.74222256742798),
				new WheelVector(7.93840483761946, 45.80891089255789));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test228() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.866043572758931, -132.2960515699871),
				new WheelVector(8.075544798256443, 137.63238780597803),
				new WheelVector(8.911261202060757, -47.38536693211379),
				new WheelVector(8.125162851656578, 42.04928704824343));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test229() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.562344526401112, -132.58049078334366),
				new WheelVector(12.198872898755852, 134.169684513742),
				new WheelVector(13.25943060617612, -44.236101539070006),
				new WheelVector(12.91559135308949, 42.64670313389169));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test230() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.180769969460473, -134.47282976055305),
				new WheelVector(12.627731954592239, 132.51428902830318),
				new WheelVector(12.851668595282485, -42.55762831621631),
				new WheelVector(13.276062780474108, 44.51632308504666));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test231() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.364107612315175, -136.93859521589053),
				new WheelVector(13.151411115048832, 133.38395245594558),
				new WheelVector(12.315250126691298, -43.2741965276537),
				new WheelVector(13.10548903899011, 46.828889925798165));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test232() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.91559135308949, -137.3532968661083),
				new WheelVector(13.25943060617612, 135.76389846093),
				new WheelVector(12.198872898755852, -45.830315486258016),
				new WheelVector(12.562344526401112, 47.41950921665634));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test233() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.276062780474108, -135.48367691495335),
				new WheelVector(12.851668595282485, 137.4423716837837),
				new WheelVector(12.627731954592239, -47.48571097169681),
				new WheelVector(12.180769969460473, 45.52717023944695));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test234() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.10548903899011, -133.17111007420186),
				new WheelVector(12.315250126691298, 136.7258034723463),
				new WheelVector(13.151411115048832, -46.616047544054446),
				new WheelVector(12.364107612315175, 43.06140478410948));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test235() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.802157599546554, -133.19126067750796),
				new WheelVector(16.441183047457383, 134.38394009160078),
				new WheelVector(17.50178562318714, -44.42127443439224),
				new WheelVector(17.155538464297763, 43.22853025996592));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test236() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.423277466202663, -134.6090123502186),
				new WheelVector(16.86738427921492, 133.1393343558283),
				new WheelVector(17.091411515064912, -43.16373160970159),
				new WheelVector(17.518588906305208, 44.633458342142966));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test237() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.60494031100022, -136.44336331599789),
				new WheelVector(17.392775868811356, 133.77810771572888),
				new WheelVector(16.556459391346127, -43.71637618757681),
				new WheelVector(17.346496973974887, 46.38164781012822));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test238() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.155538464297763, -136.7714697400341),
				new WheelVector(17.50178562318714, 135.57872556560778),
				new WheelVector(16.441183047457383, -45.61605990839923),
				new WheelVector(16.802157599546554, 46.808739322492066));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test239() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.518588906305208, -135.36654165785703),
				new WheelVector(17.091411515064912, 136.83626839029841),
				new WheelVector(16.86738427921492, -46.860665644171696),
				new WheelVector(16.423277466202663, 45.39098764978141));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test240() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.346496973974887, -133.61835218987179),
				new WheelVector(16.556459391346127, 136.2836238124232),
				new WheelVector(17.392775868811356, -46.22189228427114),
				new WheelVector(16.60494031100022, 43.55663668400213));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test241() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, -18.434948822922014),
				new WheelVector(0.7905694150420949, -18.434948822922014),
				new WheelVector(0.7905694150420949, -18.434948822922014),
				new WheelVector(0.7905694150420949, -18.434948822922014));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test242() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.790569415042095, 41.56505117707799),
				new WheelVector(0.790569415042095, 41.56505117707799),
				new WheelVector(0.790569415042095, 41.56505117707799),
				new WheelVector(0.790569415042095, 41.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test243() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, 101.56505117707799),
				new WheelVector(0.7905694150420949, 101.56505117707799),
				new WheelVector(0.7905694150420949, 101.56505117707799),
				new WheelVector(0.7905694150420949, 101.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test244() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, 161.565051177078),
				new WheelVector(0.7905694150420949, 161.565051177078),
				new WheelVector(0.7905694150420949, 161.565051177078),
				new WheelVector(0.7905694150420949, 161.565051177078));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test245() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, -138.43494882292205),
				new WheelVector(0.7905694150420949, -138.43494882292205),
				new WheelVector(0.7905694150420949, -138.43494882292205),
				new WheelVector(0.7905694150420949, -138.43494882292205));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test246() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, -78.43494882292201),
				new WheelVector(0.7905694150420949, -78.43494882292201),
				new WheelVector(0.7905694150420949, -78.43494882292201),
				new WheelVector(0.7905694150420949, -78.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test247() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.952847075210474, -124.69515353123397),
				new WheelVector(3.553167600887974, 129.28940686250036),
				new WheelVector(4.962358310319802, -40.91438322002512),
				new WheelVector(4.650268809434569, 36.2538377374448));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test248() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.4538163786300755, -134.2141955821906),
				new WheelVector(4.268849518471378, 124.34689856311074),
				new WheelVector(4.361986220593399, -34.5769342444937),
				new WheelVector(5.032012760586626, 44.4606573361759));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test249() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.8637866888964467, -144.83139886446054),
				new WheelVector(4.9216944451431885, 129.92237961726082),
				new WheelVector(3.6092830020167, -38.068211827860516),
				new WheelVector(4.724526687691227, 53.027097219934994));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test250() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.650268809434569, -143.7461622625552),
				new WheelVector(4.962358310319802, 139.08561677997488),
				new WheelVector(3.553167600887974, -50.710593137499636),
				new WheelVector(3.952847075210474, 55.30484646876604));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test251() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.032012760586626, -135.5393426638241),
				new WheelVector(4.3619862205933995, 145.42306575550631),
				new WheelVector(4.268849518471377, -55.65310143688925),
				new WheelVector(3.4538163786300755, 45.78580441780941));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test252() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.724526687691227, -126.972902780065),
				new WheelVector(3.6092830020167, 141.93178817213948),
				new WheelVector(4.9216944451431885, -50.07762038273921),
				new WheelVector(3.863786688896447, 35.16860113553947));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test253() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.162413858657255, -130.0302592718897),
				new WheelVector(7.786205751198718, 132.3974377975002),
				new WheelVector(9.199184746487049, -42.797401838234194),
				new WheelVector(8.8670739254841, 40.426078740099136));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test254() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.696278006581281, -134.64736769941288),
				new WheelVector(8.474736127025233, 129.65700019491743),
				new WheelVector(8.569063401404694, -39.71598358225109),
				new WheelVector(9.274551463300707, 44.7073765890551));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test255() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.076675996632941, -139.68540004634704),
				new WheelVector(9.155389255662843, 132.27294793772538),
				new WheelVector(7.837655745010326, -41.81401370156507),
				new WheelVector(8.945239227958817, 49.22958488041888));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test256() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.8670739254841, -139.57392125990086),
				new WheelVector(9.199184746487049, 137.20259816176582),
				new WheelVector(7.786205751198718, -47.60256220249981),
				new WheelVector(8.162413858657255, 49.9697407281103));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test257() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.274551463300707, -135.2926234109449),
				new WheelVector(8.569063401404694, 140.28401641774892),
				new WheelVector(8.474736127025233, -50.34299980508256),
				new WheelVector(7.696278006581281, 45.35263230058713));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test258() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.945239227958817, -130.77041511958112),
				new WheelVector(7.837655745010326, 138.18598629843495),
				new WheelVector(9.155389255662843, -47.72705206227463),
				new WheelVector(8.076675996632943, 40.314599953652966));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test259() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.39455525624054, -131.72951207681643),
				new WheelVector(12.026013470805694, 133.31531568210372),
				new WheelVector(13.439680055715613, -43.49256424122503),
				new WheelVector(13.100572506573902, 41.90594194108289));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test260() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.93886689480539, -134.772679750122),
				new WheelVector(12.70508672280752, 131.438903611997),
				new WheelVector(12.799639501405501, -41.465243493536526),
				new WheelVector(13.517154185261035, 44.79922218812026));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test261() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.310017982597754, -138.07216562717062),
				new WheelVector(13.394746307192978, 133.13641871118492),
				new WheelVector(12.07604121249758, -42.932831428662006),
				new WheelVector(13.180040108744734, 47.869194483043934));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test262() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.100572506573902, -138.09405805891714),
				new WheelVector(13.439680055715613, 136.50743575877496),
				new WheelVector(12.026013470805694, -46.68468431789629),
				new WheelVector(12.39455525624054, 48.27048792318357));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test263() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.517154185261035, -135.20077781187973),
				new WheelVector(12.799639501405501, 138.53475650646348),
				new WheelVector(12.70508672280752, -48.56109638800299),
				new WheelVector(11.93886689480539, 45.22732024987803));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test264() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.180040108744734, -132.13080551695606),
				new WheelVector(12.07604121249758, 137.067168571338),
				new WheelVector(13.394746307192978, -46.86358128881508),
				new WheelVector(12.310017982597754, 41.92783437282938));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test265() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.632047378479896, -132.56335175318986),
				new WheelVector(16.26729848499744, 133.75463573323165),
				new WheelVector(17.681204710086924, -43.8542371618249),
				new WheelVector(17.338540884399702, 42.662694140876184));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test266() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.181482945304285, -134.83228094910604),
				new WheelVector(16.941585074762433, 132.33016236342988),
				new WheelVector(17.036217160936484, -42.345003322606054),
				new WheelVector(17.75977504617743, 44.84718599777828));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test267() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.548123467909388, -137.2848703065308),
				new WheelVector(17.635682715602854, 133.58466857886202),
				new WheelVector(16.31663859851614, -43.47022639721625),
				new WheelVector(17.41865694279632, 47.1706230762959));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test268() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.338540884399702, -137.3373058591238),
				new WheelVector(17.681204710086924, 136.1457628381751),
				new WheelVector(16.26729848499744, -46.24536426676835),
				new WheelVector(16.632047378479896, 47.43664824681014));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test269() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.75977504617743, -135.15281400222173),
				new WheelVector(17.036217160936484, 137.65499667739394),
				new WheelVector(16.941585074762433, -47.66983763657014),
				new WheelVector(16.181482945304285, 45.167719050893986));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test270() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.41865694279632, -132.8293769237041),
				new WheelVector(16.31663859851614, 136.52977360278376),
				new WheelVector(17.635682715602854, -46.41533142113799),
				new WheelVector(16.548123467909388, 42.7151296934692));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test271() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, -14.036243467926479),
				new WheelVector(1.0307764064044151, -14.036243467926479),
				new WheelVector(1.0307764064044151, -14.036243467926479),
				new WheelVector(1.0307764064044151, -14.036243467926479));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test272() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, 45.96375653207351),
				new WheelVector(1.0307764064044151, 45.96375653207351),
				new WheelVector(1.0307764064044151, 45.96375653207351),
				new WheelVector(1.0307764064044151, 45.96375653207351));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test273() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.030776406404415, 105.96375653207352),
				new WheelVector(1.030776406404415, 105.96375653207352),
				new WheelVector(1.030776406404415, 105.96375653207352),
				new WheelVector(1.030776406404415, 105.96375653207352));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test274() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, 165.96375653207352),
				new WheelVector(1.0307764064044151, 165.96375653207352),
				new WheelVector(1.0307764064044151, 165.96375653207352),
				new WheelVector(1.0307764064044151, 165.96375653207352));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test275() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, -134.03624346792654),
				new WheelVector(1.0307764064044151, -134.03624346792654),
				new WheelVector(1.0307764064044151, -134.03624346792654),
				new WheelVector(1.0307764064044151, -134.03624346792654));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test276() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, -74.03624346792648),
				new WheelVector(1.0307764064044151, -74.03624346792648),
				new WheelVector(1.0307764064044151, -74.03624346792648),
				new WheelVector(1.0307764064044151, -74.03624346792648));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.25, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test277() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.816084380618437, -121.60750224624891),
				new WheelVector(3.400367627183861, 126.02737338510362),
				new WheelVector(5.153882032022076, -39.0938588862295),
				new WheelVector(4.8541219597369, 34.50852298766839));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test278() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.2120568910927947, -135.30926459494933),
				new WheelVector(4.3828774015514025, 121.39957587637284),
				new WheelVector(4.349182185534429, -31.29215772388343),
				new WheelVector(5.273299776077906, 45.188377767541546));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test279() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.849325846380988, -148.54001418211175),
				new WheelVector(5.168134510346066, 129.44479085922688),
				new WheelVector(3.378666258003301, -36.48453648109466),
				new WheelVector(4.827803903265261, 55.75869275271858));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test280() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.8541219597369, -145.49147701233161),
				new WheelVector(5.153882032022076, 140.9061411137705),
				new WheelVector(3.400367627183861, -53.9726266148964),
				new WheelVector(3.816084380618437, 58.3924977537511));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test281() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.273299776077906, -134.81162223245846),
				new WheelVector(4.3491821855344295, 148.70784227611657),
				new WheelVector(4.3828774015514025, -58.60042412362717),
				new WheelVector(3.2120568910927947, 44.69073540505068));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test282() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.827803903265261, -124.24130724728141),
				new WheelVector(3.3786662580033004, 143.51546351890534),
				new WheelVector(5.168134510346066, -50.5552091407731),
				new WheelVector(3.8493258463809883, 31.45998581788825));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.25, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test283() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.00390529679106, -128.6598082540901),
				new WheelVector(7.6198753270640855, 131.0090869015702),
				new WheelVector(9.38416218956173, -41.76029970389787),
				new WheelVector(9.058835465996719, 39.40066066347943));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test284() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.454670948018659, -135.1332549152307),
				new WheelVector(8.564854268115713, 128.0887057585617),
				new WheelVector(8.530432073813147, -38.060680259325316),
				new WheelVector(9.51592775596613, 45.104390367894645));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test285() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.035677877020296, -141.43941054783673),
				new WheelVector(9.399825989562782, 131.9490224076412),
				new WheelVector(7.600544149331681, -41.22581655347817),
				new WheelVector(9.030663378554566, 50.72740413459305));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test286() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.058835465996719, -140.59933933652056),
				new WheelVector(9.38416218956173, 138.23970029610214),
				new WheelVector(7.6198753270640855, -48.99091309842978),
				new WheelVector(8.00390529679106, 51.34019174590991));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test287() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.51592775596613, -134.89560963210536),
				new WheelVector(8.530432073813147, 141.9393197406747),
				new WheelVector(8.564854268115713, -51.911294241438306),
				new WheelVector(7.454670948018659, 44.86674508476931));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test288() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.030663378554566, -129.27259586540694),
				new WheelVector(7.600544149331681, 138.77418344652185),
				new WheelVector(9.399825989562784, -48.05097759235879),
				new WheelVector(8.035677877020296, 38.56058945216327));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.25, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test289() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.22957480863501, -130.85537625889572),
				new WheelVector(11.855905701379376, 132.436229788535),
				new WheelVector(13.622132725825278, -42.76882539196875),
				new WheelVector(13.287682265918312, 41.18592516570965));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test290() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.697304322571508, -135.08492307167904),
				new WheelVector(12.78686212294048, 130.37690271367467),
				new WheelVector(12.752300068964425, -40.36434554161385),
				new WheelVector(13.758563572740794, 45.07220019062067));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test291() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.26078824606518, -139.21528968635886),
				new WheelVector(13.63832258568076, 132.89772239706375),
				new WheelVector(11.83727827876451, -42.57768233705968),
				new WheelVector(13.258886513774447, 48.89746203197129));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test292() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.287682265918312, -138.81407483429035),
				new WheelVector(13.622132725825278, 137.23117460803124),
				new WheelVector(11.855905701379376, -47.563770211465005),
				new WheelVector(12.22957480863501, 49.144623741104304));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test293() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.758563572740792, -134.92779980937934),
				new WheelVector(12.752300068964425, 139.63565445838614),
				new WheelVector(12.786862122940478, -49.62309728632535),
				new WheelVector(11.69730432257151, 44.91507692832097));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test294() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.258886513774447, -131.1025379680287),
				new WheelVector(11.83727827876451, 137.42231766294034),
				new WheelVector(13.63832258568076, -47.10227760293628),
				new WheelVector(12.26078824606518, 40.78471031364114));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.25, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test295() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.463975826026957, -131.9225446005756),
				new WheelVector(16.095418602819873, 133.11181199325907),
				new WheelVector(17.86232067789625, -43.298645394673876),
				new WheelVector(17.523198908875056, 42.10873040377944));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test296() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.939941589807248, -135.06231960386992),
				new WheelVector(17.01913503290105, 131.52820580912123),
				new WheelVector(16.984523623931292, -41.5211222178533),
				new WheelVector(18.001201685263492, 45.055183582777765));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test297() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.494900360004205, -138.13199152397914),
				new WheelVector(17.878785117230976, 133.39648782793554),
				new WheelVector(16.077127937908564, -43.216737727927246),
				new WheelVector(17.494092206042964, 47.952941452006044));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test298() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.523198908875056, -137.89126959622058),
				new WheelVector(17.86232067789625, 136.70135460532612),
				new WheelVector(16.095418602819873, -46.88818800674093),
				new WheelVector(16.463975826026957, 48.07745539942438));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test299() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.001201685263492, -134.94481641722223),
				new WheelVector(16.984523623931292, 138.4788777821467),
				new WheelVector(17.01913503290105, -48.47179419087877),
				new WheelVector(15.93994158980725, 44.9376803961301));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test300() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.494092206042964, -132.04705854799394),
				new WheelVector(16.077127937908564, 136.78326227207276),
				new WheelVector(17.878785117230976, -46.60351217206447),
				new WheelVector(16.494900360004205, 41.868008476020854));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.25, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test301() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, -90.0),
				new WheelVector(0.5, -90.0),
				new WheelVector(0.5, -90.0),
				new WheelVector(0.5, -90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test302() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, -30.00000000000001),
				new WheelVector(0.5, -30.00000000000001),
				new WheelVector(0.5, -30.00000000000001),
				new WheelVector(0.5, -30.00000000000001));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test303() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.49999999999999994, 29.999999999999993),
				new WheelVector(0.49999999999999994, 29.999999999999993),
				new WheelVector(0.49999999999999994, 29.999999999999993),
				new WheelVector(0.49999999999999994, 29.999999999999993));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test304() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, 90.0),
				new WheelVector(0.5, 90.0),
				new WheelVector(0.5, 90.0),
				new WheelVector(0.5, 90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test305() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, 149.99999999999997),
				new WheelVector(0.5, 149.99999999999997),
				new WheelVector(0.5, 149.99999999999997),
				new WheelVector(0.5, 149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test306() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5, -149.99999999999997),
				new WheelVector(0.5, -149.99999999999997),
				new WheelVector(0.5, -149.99999999999997),
				new WheelVector(0.5, -149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test307() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.6097722286464435, -130.6012946450045),
				new WheelVector(3.905124837953327, 140.19442890773482),
				new WheelVector(4.6097722286464435, -49.398705354995535),
				new WheelVector(3.905124837953327, 39.8055710922652));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test308() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.141488112822091, -128.3031698039136),
				new WheelVector(3.7619042769117192, 133.02863601373085),
				new WheelVector(4.727375192572863, -43.431360845766406),
				new WheelVector(4.398644815321341, 38.69632203054232));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test309() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.7619042769117192, -133.02863601373085),
				new WheelVector(4.141488112822091, 128.3031698039136),
				new WheelVector(4.398644815321341, -38.69632203054232),
				new WheelVector(4.727375192572863, 43.431360845766406));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test310() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.905124837953327, -140.19442890773482),
				new WheelVector(4.6097722286464435, 130.6012946450045),
				new WheelVector(3.905124837953327, -39.8055710922652),
				new WheelVector(4.6097722286464435, 49.398705354995535));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test311() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.398644815321341, -141.30367796945768),
				new WheelVector(4.727375192572863, 136.56863915423358),
				new WheelVector(3.7619042769117192, -46.97136398626916),
				new WheelVector(4.141488112822091, 51.696830196086424));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test312() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.727375192572863, -136.56863915423358),
				new WheelVector(4.398644815321341, 141.30367796945768),
				new WheelVector(4.141488112822091, -51.696830196086424),
				new WheelVector(3.7619042769117192, 46.97136398626916));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test313() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.845903006477066, -132.70938995736148),
				new WheelVector(8.139410298049853, 137.48955292199915),
				new WheelVector(8.845903006477066, -47.29061004263853),
				new WheelVector(8.139410298049853, 42.510447078000844));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test314() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.369817654960793, -131.69202880239104),
				new WheelVector(8.003364765977706, 134.07352184776926),
				new WheelVector(8.969177912312066, -44.173293603586856),
				new WheelVector(8.628218380564242, 41.79120232446414));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test315() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.003364765977706, -134.07352184776926),
				new WheelVector(8.369817654960793, 131.69202880239104),
				new WheelVector(8.628218380564242, -41.79120232446414),
				new WheelVector(8.969177912312066, 44.173293603586856));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test316() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.139410298049853, -137.48955292199915),
				new WheelVector(8.845903006477066, 132.70938995736148),
				new WheelVector(8.139410298049853, -42.510447078000844),
				new WheelVector(8.845903006477066, 47.29061004263853));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test317() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.628218380564242, -138.20879767553586),
				new WheelVector(8.969177912312066, 135.82670639641313),
				new WheelVector(8.003364765977706, -45.92647815223074),
				new WheelVector(8.369817654960793, 48.30797119760897));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test318() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.969177912312066, -135.82670639641313),
				new WheelVector(8.628218380564242, 138.20879767553586),
				new WheelVector(8.369817654960793, -48.30797119760897),
				new WheelVector(8.003364765977706, 45.92647815223074));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test319() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.0862523283024, -133.45184230102205),
				new WheelVector(12.379418403139947, 136.63657704161673),
				new WheelVector(13.0862523283024, -46.54815769897797),
				new WheelVector(12.379418403139947, 43.36342295838328));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test320() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.607766311521642, -132.80464612044304),
				new WheelVector(12.24564295437116, 134.3944983114081),
				new WheelVector(13.211518786046513, -44.43876717254121),
				new WheelVector(12.866399210115468, 42.848796812519225));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test321() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.24564295437116, -134.3944983114081),
				new WheelVector(12.607766311521642, 132.80464612044304),
				new WheelVector(12.866399210115468, -42.848796812519225),
				new WheelVector(13.211518786046513, 44.43876717254121));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test322() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.379418403139947, -136.63657704161673),
				new WheelVector(13.0862523283024, 133.45184230102205),
				new WheelVector(12.379418403139947, -43.36342295838328),
				new WheelVector(13.0862523283024, 46.54815769897797));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test323() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.866399210115468, -137.1512031874808),
				new WheelVector(13.211518786046513, 135.5612328274588),
				new WheelVector(12.24564295437116, -45.605501688591886),
				new WheelVector(12.607766311521642, 47.19535387955697));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test324() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.211518786046513, -135.5612328274588),
				new WheelVector(12.866399210115468, 137.1512031874808),
				new WheelVector(12.607766311521642, -47.19535387955697),
				new WheelVector(12.24564295437116, 45.605501688591886));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test325() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.327723451163457, -133.8308606720926),
				new WheelVector(16.62077013859466, 136.21887523513132),
				new WheelVector(17.327723451163457, -46.169139327907416),
				new WheelVector(16.62077013859466, 43.78112476486871));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test326() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.84807689781201, -133.35734796811013),
				new WheelVector(16.488107688712695, 134.5503003899363),
				new WheelVector(17.454005409802452, -44.57518705698563),
				new WheelVector(17.106791190793594, 43.38219724576172));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test327() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.488107688712695, -134.5503003899363),
				new WheelVector(16.84807689781201, 133.35734796811013),
				new WheelVector(17.106791190793594, -43.38219724576172),
				new WheelVector(17.454005409802452, 44.57518705698563));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test328() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.62077013859466, -136.21887523513132),
				new WheelVector(17.327723451163457, 133.8308606720926),
				new WheelVector(16.62077013859466, -43.78112476486871),
				new WheelVector(17.327723451163457, 46.169139327907416));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test329() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.106791190793594, -136.61780275423828),
				new WheelVector(17.454005409802452, 135.4248129430144),
				new WheelVector(16.488107688712695, -45.44969961006369),
				new WheelVector(16.84807689781201, 46.642652031889874));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test330() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.454005409802452, -135.4248129430144),
				new WheelVector(17.106791190793594, 136.61780275423828),
				new WheelVector(16.84807689781201, -46.642652031889874),
				new WheelVector(16.488107688712695, 45.44969961006369));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test331() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, -63.43494882292201),
				new WheelVector(0.5590169943749475, -63.43494882292201),
				new WheelVector(0.5590169943749475, -63.43494882292201),
				new WheelVector(0.5590169943749475, -63.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test332() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, -3.434948822922018),
				new WheelVector(0.5590169943749475, -3.434948822922018),
				new WheelVector(0.5590169943749475, -3.434948822922018),
				new WheelVector(0.5590169943749475, -3.434948822922018));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test333() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, 56.565051177077976),
				new WheelVector(0.5590169943749475, 56.565051177077976),
				new WheelVector(0.5590169943749475, 56.565051177077976),
				new WheelVector(0.5590169943749475, 56.565051177077976));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test334() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, 116.56505117707799),
				new WheelVector(0.5590169943749475, 116.56505117707799),
				new WheelVector(0.5590169943749475, 116.56505117707799),
				new WheelVector(0.5590169943749475, 116.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test335() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, 176.56505117707798),
				new WheelVector(0.5590169943749475, 176.56505117707798),
				new WheelVector(0.5590169943749475, 176.56505117707798),
				new WheelVector(0.5590169943749475, 176.56505117707798));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test336() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.5590169943749475, -123.43494882292201),
				new WheelVector(0.5590169943749475, -123.43494882292201),
				new WheelVector(0.5590169943749475, -123.43494882292201),
				new WheelVector(0.5590169943749475, -123.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test337() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.451123453691214, -128.15722658736905),
				new WheelVector(3.7165171868296265, 137.72631099390625),
				new WheelVector(4.7762432936357, -47.12109639666146),
				new WheelVector(4.100304866714182, 37.568592028827496));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test338() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.894276015252389, -128.8343504487846),
				new WheelVector(3.8423250635940915, 129.4607426066998),
				new WheelVector(4.675632374949581, -40.45027597072923),
				new WheelVector(4.632452300567159, 39.81978330439611));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test339() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.69667224446123, -136.73730113260862),
				new WheelVector(4.389016050816326, 127.83186650559577),
				new WheelVector(4.16671790569948, -37.44726711130881),
				new WheelVector(4.791619174875021, 46.34022220700253));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test340() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.100304866714182, -142.43140797117252),
				new WheelVector(4.7762432936357, 132.87890360333856),
				new WheelVector(3.7165171868296265, -42.27368900609374),
				new WheelVector(4.451123453691214, 51.84277341263095));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test341() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.632452300567159, -140.1802166956039),
				new WheelVector(4.675632374949581, 139.54972402927078),
				new WheelVector(3.8423250635940915, -50.539257393300204),
				new WheelVector(3.894276015252389, 51.165649551215424));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test342() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.791619174875021, -133.65977779299746),
				new WheelVector(4.16671790569948, 142.5527328886912),
				new WheelVector(4.389016050816326, -52.16813349440425),
				new WheelVector(3.69667224446123, 43.262698867391364));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test343() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.678277478854891, -131.49646835521554),
				new WheelVector(7.956915231419774, 136.27303002005672),
				new WheelVector(9.017344398435716, -46.12330271407543),
				new WheelVector(8.325412902673357, 41.34777721969367));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test344() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.125162851656578, -132.04928704824343),
				new WheelVector(8.075544798256443, 132.36761219402197),
				new WheelVector(8.911261202060757, -42.61463306788621),
				new WheelVector(8.866043572758931, 42.29605156998708));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test345() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.93840483761946, -135.8089108925579),
				new WheelVector(8.61477938131016, 131.35507538526764),
				new WheelVector(8.391101013058615, -41.25777743257203),
				new WheelVector(9.033644260986812, 45.71083312152319));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test346() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.325412902673357, -138.65222278030632),
				new WheelVector(9.017344398435716, 133.87669728592456),
				new WheelVector(7.956915231419774, -43.72696997994329),
				new WheelVector(8.678277478854891, 48.503531644784466));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test347() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.866043572758931, -137.70394843001293),
				new WheelVector(8.911261202060757, 137.38536693211378),
				new WheelVector(8.075544798256443, -47.63238780597802),
				new WheelVector(8.125162851656578, 47.95071295175657));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test348() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.033644260986812, -134.2891668784768),
				new WheelVector(8.391101013058615, 138.74222256742797),
				new WheelVector(8.61477938131016, -48.64492461473235),
				new WheelVector(7.93840483761946, 44.191089107442124));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test349() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.91559135308949, -132.6467031338917),
				new WheelVector(12.198872898755852, 135.830315486258),
				new WheelVector(13.25943060617612, -45.763898460929994),
				new WheelVector(12.562344526401112, 42.58049078334367));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test350() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.364107612315175, -133.0614047841095),
				new WheelVector(12.315250126691298, 133.2741965276537),
				new WheelVector(13.151411115048832, -43.383952455945554),
				new WheelVector(13.10548903899011, 43.171110074201835));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test351() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.180769969460473, -135.52717023944697),
				new WheelVector(12.851668595282485, 132.55762831621632),
				new WheelVector(12.627731954592239, -42.51428902830319),
				new WheelVector(13.276062780474108, 45.48367691495335));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test352() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.562344526401112, -137.41950921665634),
				new WheelVector(13.25943060617612, 134.23610153907),
				new WheelVector(12.198872898755852, -44.16968451374199),
				new WheelVector(12.91559135308949, 47.35329686610831));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test353() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.10548903899011, -136.82888992579817),
				new WheelVector(13.151411115048832, 136.61604754405445),
				new WheelVector(12.315250126691298, -46.7258034723463),
				new WheelVector(12.364107612315177, 46.93859521589053));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test354() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.276062780474108, -134.51632308504665),
				new WheelVector(12.627731954592239, 137.48571097169682),
				new WheelVector(12.851668595282485, -47.44237168378369),
				new WheelVector(12.180769969460473, 44.47282976055305));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test355() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.155538464297763, -133.2285302599659),
				new WheelVector(16.441183047457383, 135.61605990839925),
				new WheelVector(17.50178562318714, -45.57872556560776),
				new WheelVector(16.802157599546554, 43.191260677507934));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test356() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.60494031100022, -133.55663668400211),
				new WheelVector(16.556459391346127, 133.7163761875768),
				new WheelVector(17.392775868811356, -43.778107715728865),
				new WheelVector(17.346496973974887, 43.61835218987178));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test357() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.423277466202663, -135.3909876497814),
				new WheelVector(17.091411515064912, 133.1637316097016),
				new WheelVector(16.86738427921492, -43.139334355828304),
				new WheelVector(17.518588906305208, 45.36654165785704));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test358() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.802157599546554, -136.80873932249207),
				new WheelVector(17.50178562318714, 134.42127443439225),
				new WheelVector(16.441183047457383, -44.38394009160077),
				new WheelVector(17.155538464297763, 46.77146974003408));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test359() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.346496973974887, -136.38164781012824),
				new WheelVector(17.392775868811356, 136.22189228427112),
				new WheelVector(16.556459391346127, -46.28362381242319),
				new WheelVector(16.604940311000224, 46.44336331599788));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test360() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.518588906305208, -134.63345834214297),
				new WheelVector(16.86738427921492, 136.8606656441717),
				new WheelVector(17.091411515064912, -46.83626839029841),
				new WheelVector(16.423277466202663, 44.6090123502186));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test361() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7071067811865476, -45.0),
				new WheelVector(0.7071067811865476, -45.0),
				new WheelVector(0.7071067811865476, -45.0),
				new WheelVector(0.7071067811865476, -45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test362() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7071067811865476, 14.999999999999996),
				new WheelVector(0.7071067811865476, 14.999999999999996),
				new WheelVector(0.7071067811865476, 14.999999999999996),
				new WheelVector(0.7071067811865476, 14.999999999999996));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test363() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7071067811865475, 74.99999999999999),
				new WheelVector(0.7071067811865475, 74.99999999999999),
				new WheelVector(0.7071067811865475, 74.99999999999999),
				new WheelVector(0.7071067811865475, 74.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test364() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7071067811865476, 135.0),
				new WheelVector(0.7071067811865476, 135.0),
				new WheelVector(0.7071067811865476, 135.0),
				new WheelVector(0.7071067811865476, 135.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test365() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7071067811865476, -165.00000000000003),
				new WheelVector(0.7071067811865476, -165.00000000000003),
				new WheelVector(0.7071067811865476, -165.00000000000003),
				new WheelVector(0.7071067811865476, -165.00000000000003));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test366() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7071067811865476, -105.0),
				new WheelVector(0.7071067811865476, -105.0),
				new WheelVector(0.7071067811865476, -105.0),
				new WheelVector(0.7071067811865476, -105.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test367() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.301162633521313, -125.53767779197437),
				new WheelVector(3.5355339059327378, 135.0),
				new WheelVector(4.949747468305833, -45.0),
				new WheelVector(4.301162633521313, 35.53767779197438));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test368() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.647443978636734, -129.4374816976038),
				new WheelVector(3.937003937005905, 126.05172443537292),
				new WheelVector(4.636809247747852, -37.41091053102505),
				new WheelVector(4.86786939252756, 40.834939750994565));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test369() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.647443978636734, -140.5625183023962),
				new WheelVector(4.636809247747851, 127.41091053102505),
				new WheelVector(3.937003937005906, -36.05172443537292),
				new WheelVector(4.86786939252756, 49.16506024900543));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test370() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.301162633521313, -144.46232220802563),
				new WheelVector(4.949747468305833, 135.0),
				new WheelVector(3.5355339059327378, -45.0),
				new WheelVector(4.301162633521313, 54.46232220802562));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test371() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.86786939252756, -139.16506024900545),
				new WheelVector(4.636809247747853, 142.58908946897495),
				new WheelVector(3.9370039370059047, -53.94827556462708),
				new WheelVector(3.6474439786367343, 50.56251830239619));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test372() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.86786939252756, -130.83493975099458),
				new WheelVector(3.937003937005905, 143.94827556462707),
				new WheelVector(4.636809247747852, -52.58908946897495),
				new WheelVector(3.647443978636734, 39.43748169760382));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test373() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.514693182963201, -130.2363583092738),
				new WheelVector(7.7781745930520225, 135.0),
				new WheelVector(9.192388155425117, -45.0),
				new WheelVector(8.514693182963201, 40.23635830927382));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test374() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.880843556027916, -132.4287120211297),
				new WheelVector(8.154753215150045, 130.69338090449855),
				new WheelVector(8.860022573334675, -41.03676503255021),
				new WheelVector(9.10452112114708, 42.77448901203475));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test375() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.880843556027917, -137.5712879788703),
				new WheelVector(8.860022573334675, 131.03676503255022),
				new WheelVector(8.154753215150047, -40.69338090449856),
				new WheelVector(9.104521121147078, 47.22551098796526));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test376() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.514693182963201, -139.7636416907262),
				new WheelVector(9.192388155425117, 135.0),
				new WheelVector(7.7781745930520225, -45.0),
				new WheelVector(8.514693182963201, 49.76364169072618));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test377() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.104521121147078, -137.22551098796527),
				new WheelVector(8.860022573334676, 138.9632349674498),
				new WheelVector(8.154753215150045, -49.306619095501446),
				new WheelVector(7.880843556027917, 47.57128797887031));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test378() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.10452112114708, -132.77448901203476),
				new WheelVector(8.154753215150045, 139.30661909550145),
				new WheelVector(8.860022573334675, -48.963234967449786),
				new WheelVector(7.880843556027916, 42.4287120211297));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test379() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.747548783981962, -131.82016988013575),
				new WheelVector(12.020815280171307, 135.0),
				new WheelVector(13.435028842544403, -45.0),
				new WheelVector(12.747548783981962, 41.82016988013577));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test380() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.120707187779107, -133.32848112446501),
				new WheelVector(12.389511693363866, 132.16690547392184),
				new WheelVector(13.095800853708795, -42.31981605260729),
				new WheelVector(13.34497872864996, 43.48186437656387));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test381() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.120707187779107, -136.671518875535),
				new WheelVector(13.095800853708795, 132.31981605260728),
				new WheelVector(12.389511693363866, -42.16690547392185),
				new WheelVector(13.34497872864996, 46.51813562343613));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test382() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.747548783981962, -138.17983011986425),
				new WheelVector(13.435028842544403, 135.0),
				new WheelVector(12.020815280171307, -45.0),
				new WheelVector(12.747548783981962, 48.179830119864235));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test383() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.34497872864996, -136.51813562343614),
				new WheelVector(13.095800853708795, 137.68018394739272),
				new WheelVector(12.389511693363866, -47.83309452607815),
				new WheelVector(12.120707187779107, 46.671518875535014));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test384() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.34497872864996, -133.48186437656386),
				new WheelVector(12.389511693363866, 137.83309452607816),
				new WheelVector(13.095800853708795, -47.68018394739272),
				new WheelVector(12.120707187779107, 43.328481124464986));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test385() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.98528775146303, -132.6140559696112),
				new WheelVector(16.263455967290593, 135.0),
				new WheelVector(17.67766952966369, -45.0),
				new WheelVector(16.98528775146303, 42.61405596961119));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test386() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.36201058272404, -133.761845695539),
				new WheelVector(16.62828914831589, 132.8894827063081),
				new WheelVector(17.334935823359714, -42.975553067563),
				new WheelVector(17.586489407804688, 43.84806561410308));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test387() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.36201058272404, -136.238154304461),
				new WheelVector(17.334935823359714, 132.975553067563),
				new WheelVector(16.62828914831589, -42.8894827063081),
				new WheelVector(17.586489407804688, 46.15193438589693));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test388() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.98528775146303, -137.38594403038883),
				new WheelVector(17.67766952966369, 135.0),
				new WheelVector(16.263455967290593, -45.0),
				new WheelVector(16.98528775146303, 47.385944030388806));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test389() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.586489407804688, -136.1519343858969),
				new WheelVector(17.334935823359714, 137.024446932437),
				new WheelVector(16.62828914831589, -47.110517293691906),
				new WheelVector(16.36201058272404, 46.23815430446101));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test390() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.586489407804688, -133.8480656141031),
				new WheelVector(16.62828914831589, 137.1105172936919),
				new WheelVector(17.334935823359714, -47.024446932437),
				new WheelVector(16.36201058272404, 43.76184569553899));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test391() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, -33.690067525979785),
				new WheelVector(0.9013878188659973, -33.690067525979785),
				new WheelVector(0.9013878188659973, -33.690067525979785),
				new WheelVector(0.9013878188659973, -33.690067525979785));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test392() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659974, 26.309932474020208),
				new WheelVector(0.9013878188659974, 26.309932474020208),
				new WheelVector(0.9013878188659974, 26.309932474020208),
				new WheelVector(0.9013878188659974, 26.309932474020208));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test393() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, 86.3099324740202),
				new WheelVector(0.9013878188659973, 86.3099324740202),
				new WheelVector(0.9013878188659973, 86.3099324740202),
				new WheelVector(0.9013878188659973, 86.3099324740202));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test394() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, 146.30993247402023),
				new WheelVector(0.9013878188659973, 146.30993247402023),
				new WheelVector(0.9013878188659973, 146.30993247402023),
				new WheelVector(0.9013878188659973, 146.30993247402023));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test395() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, -153.69006752597983),
				new WheelVector(0.9013878188659973, -153.69006752597983),
				new WheelVector(0.9013878188659973, -153.69006752597983),
				new WheelVector(0.9013878188659973, -153.69006752597983));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test396() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, -93.69006752597979),
				new WheelVector(0.9013878188659973, -93.69006752597979),
				new WheelVector(0.9013878188659973, -93.69006752597979),
				new WheelVector(0.9013878188659973, -93.69006752597979));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test397() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.16082924427331, -122.7352262721076),
				new WheelVector(3.3634060117684275, 131.98721249581666),
				new WheelVector(5.129571132170798, -43.025065989118026),
				new WheelVector(4.5069390943299865, 33.690067525979785));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test398() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.4010747524299885, -130.12807900020817),
				new WheelVector(4.044939814839852, 122.81365396659805),
				new WheelVector(4.611232144917814, -34.329056769744696),
				new WheelVector(5.104673400755752, 41.75617800201254));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test399() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.6148733686834325, -144.47442734838597),
				new WheelVector(4.884827336321792, 127.03268235655617),
				new WheelVector(3.709914000933626, -34.484307237998),
				new WheelVector(4.955571665144526, 51.89636793222881));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test400() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.5069390943299865, -146.30993247402023),
				new WheelVector(5.129571132170798, 136.97493401088198),
				new WheelVector(3.3634060117684275, -48.01278750418334),
				new WheelVector(4.16082924427331, 57.264773727892404));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test401() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.104673400755751, -138.24382199798748),
				new WheelVector(4.611232144917814, 145.6709432302553),
				new WheelVector(4.044939814839852, -57.18634603340196),
				new WheelVector(3.401074752429989, 49.87192099979183));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test402() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.955571665144526, -128.1036320677712),
				new WheelVector(3.7099140009336256, 145.515692762002),
				new WheelVector(4.884827336321792, -52.967317643443835),
				new WheelVector(3.614873368683433, 35.52557265161402));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test403() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.355387483534201, -128.9275435927923),
				new WheelVector(7.603453162872775, 133.66778014613035),
				new WheelVector(9.370832406995657, -43.91907581333931),
				new WheelVector(8.707037383633999, 39.17365797044423));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test404() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.636891968807299, -132.8323962267909),
				new WheelVector(8.24078735384874, 129.05273022549335),
				new WheelVector(8.815578471583512, -39.44176669495033),
				new WheelVector(9.343601075429461, 43.228472681005165));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test405() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.830844076038892, -139.35788003674995),
				new WheelVector(9.105524488537347, 130.73561027893047),
				new WheelVector(7.919243889958604, -40.09535440806694),
				new WheelVector(9.181660038182995, 48.71576547060357));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test406() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.707037383633999, -140.82634202955578),
				new WheelVector(9.370832406995657, 136.0809241866607),
				new WheelVector(7.603453162872775, -46.332219853869645),
				new WheelVector(8.355387483534201, 51.0724564072077));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test407() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.343601075429461, -136.77152731899486),
				new WheelVector(8.815578471583512, 140.55823330504967),
				new WheelVector(8.24078735384874, -50.94726977450665),
				new WheelVector(7.636891968807299, 47.16760377320909));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test408() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.181660038182995, -131.28423452939643),
				new WheelVector(7.9192438899586035, 139.90464559193305),
				new WheelVector(9.105524488537347, -49.26438972106954),
				new WheelVector(7.830844076038893, 40.642119963250046));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test409() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.58222953216162, -130.97173633351485),
				new WheelVector(11.845357740482134, 134.1449026037333),
				new WheelVector(13.612953390061982, -44.25594079711129),
				new WheelVector(12.93493332027653, 41.08175113593263));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test410() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.877580915946233, -133.60649746768962),
				new WheelVector(12.46834448982823, 131.07321211468414),
				new WheelVector(13.044745520054043, -41.24697729811985),
				new WheelVector(13.584847131460474, 43.78165322805074));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test411() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.065526445822831, -137.8267991987238),
				new WheelVector(13.340150460809276, 132.09071190735236),
				new WheelVector(12.15176471476345, -41.80591522602411),
				new WheelVector(13.418199267604795, 47.541635331429795));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test412() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.93493332027653, -138.91824886406738),
				new WheelVector(13.612953390061982, 135.7440592028887),
				new WheelVector(11.845357740482134, -45.85509739626673),
				new WheelVector(12.58222953216162, 49.028263666485145));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test413() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.584847131460474, -136.21834677194926),
				new WheelVector(13.044745520054043, 138.75302270188016),
				new WheelVector(12.46834448982823, -48.926787885315875),
				new WheelVector(11.877580915946233, 46.39350253231039));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test414() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.418199267604795, -132.4583646685702),
				new WheelVector(12.15176471476345, 138.1940847739759),
				new WheelVector(13.340150460809276, -47.90928809264767),
				new WheelVector(12.065526445822831, 42.1732008012762));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test415() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.81703005884214, -131.98721249581666),
				new WheelVector(16.08765054319617, 134.37040139158972),
				new WheelVector(17.855321335669096, -44.43273359014207),
				new WheelVector(17.170104833692776, 42.049220890993645));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test416() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.11929706551954, -133.9732372853571),
				new WheelVector(16.70355208998094, 132.0698714083103),
				new WheelVector(17.280519308669327, -42.16778457294859),
				new WheelVector(17.826756915197254, 44.07159043523703));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test417() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.30434720822845, -137.09150097794162),
				new WheelVector(17.578641939089227, 132.79259032237204),
				new WheelVector(16.389519443146995, -42.632346150833946),
				new WheelVector(17.657668648876985, 46.931140624537186));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test418() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.170104833692776, -137.95077910900636),
				new WheelVector(17.855321335669096, 135.56726640985792),
				new WheelVector(16.08765054319617, -45.62959860841026),
				new WheelVector(16.81703005884214, 48.01278750418334));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test419() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.826756915197254, -135.928409564763),
				new WheelVector(17.280519308669327, 137.8322154270514),
				new WheelVector(16.70355208998094, -47.9301285916897),
				new WheelVector(16.11929706551954, 46.026762714642906));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test420() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.657668648876985, -133.0688593754628),
				new WheelVector(16.389519443146995, 137.36765384916606),
				new WheelVector(17.578641939089227, -47.20740967762797),
				new WheelVector(16.30434720822845, 42.9084990220584));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test421() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, -26.56505117707799),
				new WheelVector(1.118033988749895, -26.56505117707799),
				new WheelVector(1.118033988749895, -26.56505117707799),
				new WheelVector(1.118033988749895, -26.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test422() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, 33.43494882292201),
				new WheelVector(1.118033988749895, 33.43494882292201),
				new WheelVector(1.118033988749895, 33.43494882292201),
				new WheelVector(1.118033988749895, 33.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test423() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.1180339887498947, 93.43494882292201),
				new WheelVector(1.1180339887498947, 93.43494882292201),
				new WheelVector(1.1180339887498947, 93.43494882292201),
				new WheelVector(1.1180339887498947, 93.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test424() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, 153.434948822922),
				new WheelVector(1.118033988749895, 153.434948822922),
				new WheelVector(1.118033988749895, 153.434948822922),
				new WheelVector(1.118033988749895, 153.434948822922));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test425() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, -146.56505117707803),
				new WheelVector(1.118033988749895, -146.56505117707803),
				new WheelVector(1.118033988749895, -146.56505117707803),
				new WheelVector(1.118033988749895, -146.56505117707803));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test426() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, -86.56505117707799),
				new WheelVector(1.118033988749895, -86.56505117707799),
				new WheelVector(1.118033988749895, -86.56505117707799),
				new WheelVector(1.118033988749895, -86.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.5, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test427() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.031128874149275, -119.74488129694222),
				new WheelVector(3.2015621187164243, 128.6598082540901),
				new WheelVector(5.315072906367325, -41.18592516570965),
				new WheelVector(4.716990566028302, 32.005383208083494));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test428() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.1552767495007554, -130.92640373863384),
				new WheelVector(4.165102184983378, 119.75308741311584),
				new WheelVector(4.599122067160937, -31.22192429144297),
				new WheelVector(5.3426799112486565, 42.595538536296566));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test429() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.599412641798666, -148.43862065398358),
				new WheelVector(5.133037717702191, 126.69101926155491),
				new WheelVector(3.4859609562711236, -32.71402354727957),
				new WheelVector(5.054129859239862, 54.5269462552926));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test430() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.716990566028302, -147.9946167919165),
				new WheelVector(5.315072906367325, 138.81407483429035),
				new WheelVector(3.2015621187164243, -51.34019174590991),
				new WheelVector(4.031128874149275, 60.25511870305778));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test431() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.3426799112486565, -137.40446146370343),
				new WheelVector(4.599122067160937, 148.77807570855703),
				new WheelVector(4.165102184983378, -60.24691258688419),
				new WheelVector(3.1552767495007554, 49.07359626136615));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test432() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.054129859239862, -125.4730537447074),
				new WheelVector(3.485960956271123, 147.28597645272043),
				new WheelVector(5.133037717702191, -53.3089807384451),
				new WheelVector(3.5994126417986663, 31.561379346016416));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.5, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test433() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.200609733428363, -127.56859202882751),
				new WheelVector(7.433034373659253, 132.27368900609375),
				new WheelVector(9.5524865872714, -42.87890360333855),
				new WheelVector(8.902246907382429, 38.15722658736907));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test434() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.39334448892246, -133.26269886739138),
				new WheelVector(8.33343581139896, 127.44726711130879),
				new WheelVector(8.778032101632652, -37.831866505595755),
				new WheelVector(9.583238349750042, 43.65977779299746));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test435() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.788552030504778, -141.1656495512154),
				new WheelVector(9.35126474989916, 130.45027597072922),
				new WheelVector(7.684650127188184, -39.460742606699796),
				new WheelVector(9.26490460113432, 50.18021669560388));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test436() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.902246907382429, -141.84277341263095),
				new WheelVector(9.5524865872714, 137.12109639666144),
				new WheelVector(7.433034373659253, -47.72631099390627),
				new WheelVector(8.200609733428363, 52.431407971172504));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test437() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.583238349750042, -136.34022220700254),
				new WheelVector(8.778032101632652, 142.16813349440426),
				new WheelVector(8.33343581139896, -52.552732888691196),
				new WheelVector(7.39334448892246, 46.73730113260864));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test438() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.264904601134319, -129.81978330439614),
				new WheelVector(7.684650127188183, 140.5392573933002),
				new WheelVector(9.351264749899162, -49.54972402927078),
				new WheelVector(7.788552030504778, 38.83435044878458));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.5, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test439() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.419742348374221, -130.10090754621223),
				new WheelVector(11.672617529928752, 133.26429541107163),
				new WheelVector(13.793114224133722, -43.53119928561417),
				new WheelVector(13.124404748406688, 40.36453657309736));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test440() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.634745983381853, -133.89612612156546),
				new WheelVector(12.551662385280284, 129.99364949419328),
				new WheelVector(12.998298787377525, -40.166090078073594),
				new WheelVector(13.825074535140121, 44.07103138584576));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test441() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.015295006691272, -138.99221638023),
				new WheelVector(13.584705688164908, 131.86985311476963),
				new WheelVector(11.914519351024616, -41.430533293096154),
				new WheelVector(13.495654333976542, 48.55370672582194));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test442() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.124404748406688, -139.63546342690265),
				new WheelVector(13.793114224133722, 136.46880071438582),
				new WheelVector(11.672617529928752, -46.73570458892839),
				new WheelVector(12.419742348374221, 49.899092453787766));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test443() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.825074535140121, -135.92896861415426),
				new WheelVector(12.998298787377529, 139.83390992192642),
				new WheelVector(12.551662385280283, -50.00635050580672),
				new WheelVector(11.634745983381853, 46.103873878434555));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test444() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.495654333976542, -131.44629327417806),
				new WheelVector(11.914519351024616, 138.56946670690385),
				new WheelVector(13.584705688164908, -48.13014688523038),
				new WheelVector(12.015295006691272, 41.007783619770024));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.5, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test445() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.650825805346713, -131.34777721969368),
				new WheelVector(15.913830462839549, 133.7269699799433),
				new WheelVector(18.034688796871432, -43.87669728592458),
				new WheelVector(17.356554957709783, 41.49646835521554));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test446() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.87680967523892, -134.1910891074421),
				new WheelVector(16.78220202611723, 131.25777743257206),
				new WheelVector(17.22955876262032, -41.35507538526765),
				new WheelVector(18.067288521973623, 44.28916687847683));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test447() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.250325703313155, -137.95071295175657),
				new WheelVector(17.822522404121514, 132.61463306788622),
				new WheelVector(16.151089596512886, -42.36761219402198),
				new WheelVector(17.732087145517863, 47.703948430012915));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test448() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.356554957709783, -138.50353164478446),
				new WheelVector(18.034688796871432, 136.12330271407544),
				new WheelVector(15.913830462839549, -46.27303002005671),
				new WheelVector(16.650825805346713, 48.65222278030633));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test449() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.067288521973623, -135.7108331215232),
				new WheelVector(17.229558762620325, 138.64492461473236),
				new WheelVector(16.78220202611723, -48.74222256742798),
				new WheelVector(15.87680967523892, 45.80891089255789));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test450() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.732087145517863, -132.2960515699871),
				new WheelVector(16.151089596512886, 137.63238780597803),
				new WheelVector(17.822522404121514, -47.38536693211379),
				new WheelVector(16.250325703313155, 42.04928704824343));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.5, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test451() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.75, -90.0),
				new WheelVector(0.75, -90.0),
				new WheelVector(0.75, -90.0),
				new WheelVector(0.75, -90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test452() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7500000000000001, -30.00000000000001),
				new WheelVector(0.7500000000000001, -30.00000000000001),
				new WheelVector(0.7500000000000001, -30.00000000000001),
				new WheelVector(0.7500000000000001, -30.00000000000001));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test453() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7499999999999999, 29.999999999999993),
				new WheelVector(0.7499999999999999, 29.999999999999993),
				new WheelVector(0.7499999999999999, 29.999999999999993),
				new WheelVector(0.7499999999999999, 29.999999999999993));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test454() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.75, 90.0),
				new WheelVector(0.75, 90.0),
				new WheelVector(0.75, 90.0),
				new WheelVector(0.75, 90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test455() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.75, 149.99999999999997),
				new WheelVector(0.75, 149.99999999999997),
				new WheelVector(0.75, 149.99999999999997),
				new WheelVector(0.75, 149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test456() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7500000000000001, -149.99999999999997),
				new WheelVector(0.7500000000000001, -149.99999999999997),
				new WheelVector(0.7500000000000001, -149.99999999999997),
				new WheelVector(0.7500000000000001, -149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test457() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.802343178074636, -128.6598082540901),
				new WheelVector(3.75, 143.13010235415598),
				new WheelVector(4.802343178074636, -51.34019174590991),
				new WheelVector(3.75, 36.86989764584401));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test458() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.112831832566222, -124.85485017751394),
				new WheelVector(3.523547315273349, 131.84194316130726),
				new WheelVector(4.970876614544961, -42.76201288047239),
				new WheelVector(4.495510462342399, 35.726439595021844));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test459() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.523547315273349, -131.84194316130726),
				new WheelVector(4.112831832566222, 124.85485017751394),
				new WheelVector(4.495510462342399, -35.726439595021844),
				new WheelVector(4.970876614544961, 42.76201288047239));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test460() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.75, -143.13010235415598),
				new WheelVector(4.802343178074636, 128.6598082540901),
				new WheelVector(3.75, -36.86989764584401),
				new WheelVector(4.802343178074636, 51.34019174590991));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test461() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.495510462342399, -144.27356040497816),
				new WheelVector(4.970876614544961, 137.23798711952762),
				new WheelVector(3.523547315273349, -48.158056838692744),
				new WheelVector(4.112831832566222, 55.14514982248608));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test462() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.970876614544961, -137.23798711952762),
				new WheelVector(4.495510462342399, 144.27356040497816),
				new WheelVector(4.112831832566222, -55.145149822486076),
				new WheelVector(3.523547315273349, 48.15805683869275));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test463() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.031195934094221, -131.63353933657018),
				new WheelVector(7.9726093595509875, 138.81407483429035),
				new WheelVector(9.031195934094221, -48.366460663429805),
				new WheelVector(7.9726093595509875, 41.18592516570965));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test464() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.322756236123947, -130.00643803567303),
				new WheelVector(7.763264221056762, 133.56721500899667),
				new WheelVector(9.211771199615194, -43.7925500710546),
				new WheelVector(8.709576834385237, 40.2287444652323));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test465() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.763264221056762, -133.56721500899667),
				new WheelVector(8.322756236123947, 130.00643803567303),
				new WheelVector(8.709576834385237, -40.2287444652323),
				new WheelVector(9.211771199615194, 43.7925500710546));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test466() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.9726093595509875, -138.81407483429035),
				new WheelVector(9.031195934094221, 131.63353933657018),
				new WheelVector(7.9726093595509875, -41.18592516570965),
				new WheelVector(9.031195934094221, 48.366460663429805));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test467() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.709576834385237, -139.7712555347677),
				new WheelVector(9.211771199615194, 136.2074499289454),
				new WheelVector(7.763264221056762, -46.43278499100335),
				new WheelVector(8.322756236123947, 49.99356196432699));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test468() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.211771199615194, -136.2074499289454),
				new WheelVector(8.709576834385237, 139.7712555347677),
				new WheelVector(8.322756236123947, -49.99356196432699),
				new WheelVector(7.763264221056762, 46.43278499100335));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test469() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.268854509715599, -132.70938995736148),
				new WheelVector(12.20911544707478, 137.48955292199915),
				new WheelVector(13.268854509715599, -47.29061004263853),
				new WheelVector(12.20911544707478, 42.510447078000844));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test470() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.554726482441188, -131.69202880239104),
				new WheelVector(12.005047148966558, 134.07352184776929),
				new WheelVector(13.453766868468099, -44.173293603586856),
				new WheelVector(12.942327570846363, 41.791202324464145));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test471() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.005047148966558, -134.07352184776929),
				new WheelVector(12.554726482441188, 131.69202880239104),
				new WheelVector(12.942327570846363, -41.791202324464145),
				new WheelVector(13.453766868468099, 44.173293603586856));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test472() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.20911544707478, -137.48955292199915),
				new WheelVector(13.268854509715599, 132.70938995736148),
				new WheelVector(12.20911544707478, -42.510447078000844),
				new WheelVector(13.268854509715599, 47.29061004263853));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test473() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.942327570846363, -138.20879767553586),
				new WheelVector(13.453766868468099, 135.82670639641313),
				new WheelVector(12.005047148966558, -45.92647815223074),
				new WheelVector(12.554726482441188, 48.30797119760897));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test474() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.453766868468099, -135.82670639641313),
				new WheelVector(12.942327570846363, 138.20879767553586),
				new WheelVector(12.554726482441188, -48.30797119760897),
				new WheelVector(12.005047148966558, 45.92647815223074));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test475() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.50892629489313, -133.26429541107163),
				new WheelVector(16.44878414959598, 136.8476102659946),
				new WheelVector(17.50892629489313, -46.73570458892839),
				new WheelVector(16.44878414959598, 43.15238973400541));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test476() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.792082739549613, -132.52737690669412),
				new WheelVector(16.247278009927697, 134.315442635234),
				new WheelVector(17.696071803316123, -44.37149032926838),
				new WheelVector(17.179958011244377, 42.583235316612765));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test477() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.247278009927697, -134.315442635234),
				new WheelVector(16.792082739549613, 132.52737690669412),
				new WheelVector(17.179958011244377, -42.583235316612765),
				new WheelVector(17.696071803316123, 44.37149032926838));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test478() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.44878414959598, -136.8476102659946),
				new WheelVector(17.50892629489313, 133.26429541107163),
				new WheelVector(16.44878414959598, -43.15238973400541),
				new WheelVector(17.50892629489313, 46.73570458892839));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test479() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.179958011244377, -137.41676468338724),
				new WheelVector(17.696071803316123, 135.62850967073163),
				new WheelVector(16.247278009927697, -45.684557364766),
				new WheelVector(16.792082739549613, 47.47262309330589));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test480() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.696071803316123, -135.62850967073163),
				new WheelVector(17.179958011244377, 137.41676468338724),
				new WheelVector(16.792082739549613, -47.47262309330589),
				new WheelVector(16.247278009927697, 45.684557364766));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test481() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, -71.56505117707799),
				new WheelVector(0.7905694150420949, -71.56505117707799),
				new WheelVector(0.7905694150420949, -71.56505117707799),
				new WheelVector(0.7905694150420949, -71.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test482() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, -11.565051177077999),
				new WheelVector(0.7905694150420949, -11.565051177077999),
				new WheelVector(0.7905694150420949, -11.565051177077999),
				new WheelVector(0.7905694150420949, -11.565051177077999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test483() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420947, 48.434948822922),
				new WheelVector(0.7905694150420947, 48.434948822922),
				new WheelVector(0.7905694150420947, 48.434948822922),
				new WheelVector(0.7905694150420947, 48.434948822922));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test484() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, 108.43494882292202),
				new WheelVector(0.7905694150420949, 108.43494882292202),
				new WheelVector(0.7905694150420949, 108.43494882292202),
				new WheelVector(0.7905694150420949, 108.43494882292202));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test485() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.7905694150420949, 168.434948822922),
				new WheelVector(0.7905694150420949, 168.434948822922),
				new WheelVector(0.7905694150420949, 168.434948822922),
				new WheelVector(0.7905694150420949, 168.434948822922));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test486() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.790569415042095, -131.56505117707798),
				new WheelVector(0.790569415042095, -131.56505117707798),
				new WheelVector(0.790569415042095, -131.56505117707798),
				new WheelVector(0.790569415042095, -131.56505117707798));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test487() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.650268809434569, -126.2538377374448),
				new WheelVector(3.553167600887974, 140.71059313749964),
				new WheelVector(4.962358310319802, -49.08561677997488),
				new WheelVector(3.952847075210474, 34.69515353123397));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test488() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.863786688896447, -125.16860113553946),
				new WheelVector(3.6092830020167, 128.06821182786052),
				new WheelVector(4.9216944451431885, -39.922379617260795),
				new WheelVector(4.724526687691227, 36.972902780065));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test489() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.4538163786300755, -135.78580441780943),
				new WheelVector(4.361986220593399, 124.57693424449369),
				new WheelVector(4.268849518471378, -34.346898563110756),
				new WheelVector(5.032012760586626, 45.5393426638241));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test490() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.952847075210474, -145.30484646876602),
				new WheelVector(4.962358310319802, 130.91438322002512),
				new WheelVector(3.553167600887974, -39.28940686250036),
				new WheelVector(4.650268809434569, 53.74616226255521));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test491() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.724526687691227, -143.027097219935),
				new WheelVector(4.9216944451431885, 140.0776203827392),
				new WheelVector(3.6092830020167, -51.931788172139484),
				new WheelVector(3.863786688896447, 54.83139886446054));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test492() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.032012760586626, -134.4606573361759),
				new WheelVector(4.268849518471378, 145.65310143688924),
				new WheelVector(4.361986220593399, -55.42306575550631),
				new WheelVector(3.4538163786300755, 44.2141955821906));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test493() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.8670739254841, -130.42607874009914),
				new WheelVector(7.786205751198718, 137.6025622024998),
				new WheelVector(9.199184746487049, -47.202598161765806),
				new WheelVector(8.162413858657255, 40.0302592718897));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test494() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.076675996632943, -130.31459995365296),
				new WheelVector(7.837655745010326, 131.81401370156507),
				new WheelVector(9.155389255662843, -42.27294793772537),
				new WheelVector(8.945239227958817, 40.77041511958112));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test495() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.696278006581281, -135.35263230058712),
				new WheelVector(8.569063401404692, 129.7159835822511),
				new WheelVector(8.474736127025233, -39.65700019491744),
				new WheelVector(9.274551463300705, 45.2926234109449));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test496() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.162413858657255, -139.9697407281103),
				new WheelVector(9.199184746487049, 132.7974018382342),
				new WheelVector(7.786205751198718, -42.397437797500196),
				new WheelVector(8.8670739254841, 49.573921259900864));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test497() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.945239227958817, -139.22958488041888),
				new WheelVector(9.155389255662843, 137.72705206227462),
				new WheelVector(7.837655745010326, -48.18598629843493),
				new WheelVector(8.076675996632943, 49.68540004634704));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test498() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.274551463300707, -134.7073765890551),
				new WheelVector(8.474736127025233, 140.34299980508257),
				new WheelVector(8.569063401404694, -50.28401641774891),
				new WheelVector(7.696278006581281, 44.64736769941287));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test499() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.100572506573902, -131.9059419410829),
				new WheelVector(12.026013470805694, 136.68468431789628),
				new WheelVector(13.439680055715613, -46.50743575877497),
				new WheelVector(12.39455525624054, 41.729512076816434));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test500() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.310017982597754, -131.92783437282938),
				new WheelVector(12.07604121249758, 132.932831428662),
				new WheelVector(13.394746307192978, -43.13641871118492),
				new WheelVector(13.180040108744734, 42.13080551695607));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test501() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.93886689480539, -135.22732024987803),
				new WheelVector(12.799639501405501, 131.46524349353652),
				new WheelVector(12.70508672280752, -41.43890361199701),
				new WheelVector(13.517154185261035, 45.20077781187974));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test502() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.39455525624054, -138.27048792318357),
				new WheelVector(13.439680055715613, 133.492564241225),
				new WheelVector(12.026013470805694, -43.31531568210371),
				new WheelVector(13.100572506573902, 48.09405805891711));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test503() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.180040108744732, -137.86919448304394),
				new WheelVector(13.39474630719298, 136.86358128881508),
				new WheelVector(12.07604121249758, -47.06716857133799),
				new WheelVector(12.310017982597756, 48.072165627170634));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test504() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.517154185261035, -134.79922218812027),
				new WheelVector(12.70508672280752, 138.56109638800297),
				new WheelVector(12.799639501405501, -48.53475650646348),
				new WheelVector(11.93886689480539, 44.77267975012198));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test505() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.338540884399702, -132.6626941408762),
				new WheelVector(16.26729848499744, 136.24536426676835),
				new WheelVector(17.681204710086924, -46.14576283817511),
				new WheelVector(16.632047378479896, 42.56335175318987));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test506() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.548123467909388, -132.7151296934692),
				new WheelVector(16.31663859851614, 133.47022639721624),
				new WheelVector(17.635682715602854, -43.58466857886201),
				new WheelVector(17.41865694279632, 42.8293769237041));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test507() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.181482945304285, -135.167719050894),
				new WheelVector(17.036217160936484, 132.34500332260606),
				new WheelVector(16.941585074762433, -42.33016236342986),
				new WheelVector(17.75977504617743, 45.15281400222172));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test508() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.632047378479896, -137.43664824681014),
				new WheelVector(17.681204710086924, 133.8542371618249),
				new WheelVector(16.26729848499744, -43.75463573323165),
				new WheelVector(17.338540884399702, 47.33730585912382));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test509() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.41865694279632, -137.17062307629593),
				new WheelVector(17.635682715602854, 136.415331421138),
				new WheelVector(16.31663859851614, -46.52977360278375),
				new WheelVector(16.54812346790939, 47.2848703065308));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test510() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.75977504617743, -134.8471859977783),
				new WheelVector(16.941585074762433, 137.66983763657012),
				new WheelVector(17.036217160936484, -47.65499667739395),
				new WheelVector(16.181482945304285, 44.832280949106014));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test511() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, -56.309932474020215),
				new WheelVector(0.9013878188659973, -56.309932474020215),
				new WheelVector(0.9013878188659973, -56.309932474020215),
				new WheelVector(0.9013878188659973, -56.309932474020215));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test512() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, 3.690067525979779),
				new WheelVector(0.9013878188659973, 3.690067525979779),
				new WheelVector(0.9013878188659973, 3.690067525979779),
				new WheelVector(0.9013878188659973, 3.690067525979779));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test513() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, 63.690067525979785),
				new WheelVector(0.9013878188659973, 63.690067525979785),
				new WheelVector(0.9013878188659973, 63.690067525979785),
				new WheelVector(0.9013878188659973, 63.690067525979785));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test514() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, 123.69006752597979),
				new WheelVector(0.9013878188659973, 123.69006752597979),
				new WheelVector(0.9013878188659973, 123.69006752597979),
				new WheelVector(0.9013878188659973, 123.69006752597979));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test515() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659973, -176.30993247402023),
				new WheelVector(0.9013878188659973, -176.30993247402023),
				new WheelVector(0.9013878188659973, -176.30993247402023),
				new WheelVector(0.9013878188659973, -176.30993247402023));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test516() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9013878188659974, -116.30993247402023),
				new WheelVector(0.9013878188659974, -116.30993247402023),
				new WheelVector(0.9013878188659974, -116.30993247402023),
				new WheelVector(0.9013878188659974, -116.30993247402023));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test517() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.5069390943299865, -123.6900675259798),
				new WheelVector(3.3634060117684275, 138.01278750418336),
				new WheelVector(5.129571132170798, -46.97493401088198),
				new WheelVector(4.16082924427331, 32.7352262721076));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test518() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.614873368683433, -125.52557265161403),
				new WheelVector(3.7099140009336256, 124.48430723799801),
				new WheelVector(4.884827336321792, -37.032682356556165),
				new WheelVector(4.955571665144526, 38.10363206777118));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test519() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.401074752429989, -139.87192099979183),
				new WheelVector(4.611232144917814, 124.3290567697447),
				new WheelVector(4.044939814839852, -32.81365396659805),
				new WheelVector(5.104673400755751, 48.24382199798745));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test520() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.16082924427331, -147.2647737278924),
				new WheelVector(5.129571132170798, 133.02506598911802),
				new WheelVector(3.3634060117684275, -41.98721249581666),
				new WheelVector(4.5069390943299865, 56.309932474020215));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test521() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.955571665144526, -141.89636793222883),
				new WheelVector(4.884827336321793, 142.96731764344383),
				new WheelVector(3.709914000933625, -55.51569276200198),
				new WheelVector(3.6148733686834333, 54.47442734838598));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test522() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.104673400755752, -131.75617800201255),
				new WheelVector(4.044939814839852, 147.18634603340197),
				new WheelVector(4.611232144917814, -55.670943230255304),
				new WheelVector(3.4010747524299885, 40.128079000208174));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test523() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.707037383633999, -129.17365797044422),
				new WheelVector(7.603453162872775, 136.33221985386965),
				new WheelVector(9.370832406995657, -46.08092418666069),
				new WheelVector(8.355387483534201, 38.9275435927923));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test524() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.830844076038893, -130.64211996325005),
				new WheelVector(7.9192438899586035, 130.09535440806695),
				new WheelVector(9.105524488537347, -40.73561027893046),
				new WheelVector(9.181660038182995, 41.284234529396436));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test525() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.6368919688073, -137.1676037732091),
				new WheelVector(8.81557847158351, 129.44176669495033),
				new WheelVector(8.24078735384874, -39.05273022549336),
				new WheelVector(9.34360107542946, 46.771527318994835));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test526() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.355387483534201, -141.0724564072077),
				new WheelVector(9.370832406995657, 133.91907581333933),
				new WheelVector(7.603453162872775, -43.66778014613036),
				new WheelVector(8.707037383633999, 50.826342029555775));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test527() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.181660038182995, -138.71576547060357),
				new WheelVector(9.105524488537347, 139.26438972106953),
				new WheelVector(7.9192438899586035, -49.90464559193305),
				new WheelVector(7.830844076038893, 49.357880036749954));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test528() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.343601075429461, -133.22847268100517),
				new WheelVector(8.24078735384874, 140.94726977450665),
				new WheelVector(8.815578471583512, -50.558233305049676),
				new WheelVector(7.636891968807299, 42.83239622679091));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test529() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.93493332027653, -131.08175113593262),
				new WheelVector(11.845357740482134, 135.85509739626673),
				new WheelVector(13.612953390061982, -45.74405920288871),
				new WheelVector(12.58222953216162, 40.971736333514855));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test530() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.065526445822831, -132.1732008012762),
				new WheelVector(12.15176471476345, 131.8059152260241),
				new WheelVector(13.340150460809276, -42.09071190735233),
				new WheelVector(13.418199267604795, 42.458364668570205));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test531() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.877580915946233, -136.3935025323104),
				new WheelVector(13.044745520054043, 131.24697729811987),
				new WheelVector(12.46834448982823, -41.073212114684125),
				new WheelVector(13.584847131460474, 46.21834677194926));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test532() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.58222953216162, -139.02826366648517),
				new WheelVector(13.612953390061982, 134.2559407971113),
				new WheelVector(11.845357740482134, -44.14490260373328),
				new WheelVector(12.93493332027653, 48.91824886406737));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test533() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.418199267604795, -137.5416353314298),
				new WheelVector(13.340150460809276, 137.90928809264767),
				new WheelVector(12.15176471476345, -48.19408477397589),
				new WheelVector(12.065526445822831, 47.826799198723805));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test534() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.584847131460474, -133.78165322805074),
				new WheelVector(12.46834448982823, 138.92678788531586),
				new WheelVector(13.044745520054043, -48.753022701880155),
				new WheelVector(11.877580915946233, 43.60649746768961));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test535() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.170104833692776, -132.04922089099367),
				new WheelVector(16.08765054319617, 135.62959860841028),
				new WheelVector(17.855321335669096, -45.567266409857936),
				new WheelVector(16.81703005884214, 41.98721249581666));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test536() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.30434720822845, -132.9084990220584),
				new WheelVector(16.389519443146995, 132.63234615083394),
				new WheelVector(17.578641939089227, -42.792590322372035),
				new WheelVector(17.657668648876985, 43.068859375462814));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test537() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.11929706551954, -136.0267627146429),
				new WheelVector(17.280519308669327, 132.1677845729486),
				new WheelVector(16.70355208998094, -42.069871408310306),
				new WheelVector(17.826756915197254, 45.92840956476298));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test538() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.81703005884214, -138.01278750418336),
				new WheelVector(17.855321335669096, 134.43273359014208),
				new WheelVector(16.08765054319617, -44.37040139158974),
				new WheelVector(17.170104833692776, 47.95077910900635));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test539() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.657668648876985, -136.9311406245372),
				new WheelVector(17.578641939089227, 137.20740967762796),
				new WheelVector(16.389519443146995, -47.36765384916606),
				new WheelVector(16.30434720822845, 47.09150097794161));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test540() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.826756915197254, -134.07159043523703),
				new WheelVector(16.70355208998094, 137.9301285916897),
				new WheelVector(17.280519308669327, -47.832215427051416),
				new WheelVector(16.11929706551954, 43.973237285357094));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test541() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0606601717798212, -45.0),
				new WheelVector(1.0606601717798212, -45.0),
				new WheelVector(1.0606601717798212, -45.0),
				new WheelVector(1.0606601717798212, -45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test542() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0606601717798212, 14.999999999999996),
				new WheelVector(1.0606601717798212, 14.999999999999996),
				new WheelVector(1.0606601717798212, 14.999999999999996),
				new WheelVector(1.0606601717798212, 14.999999999999996));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test543() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0606601717798212, 74.99999999999999),
				new WheelVector(1.0606601717798212, 74.99999999999999),
				new WheelVector(1.0606601717798212, 74.99999999999999),
				new WheelVector(1.0606601717798212, 74.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test544() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0606601717798212, 135.0),
				new WheelVector(1.0606601717798212, 135.0),
				new WheelVector(1.0606601717798212, 135.0),
				new WheelVector(1.0606601717798212, 135.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test545() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0606601717798212, -165.00000000000003),
				new WheelVector(1.0606601717798212, -165.00000000000003),
				new WheelVector(1.0606601717798212, -165.00000000000003),
				new WheelVector(1.0606601717798212, -165.00000000000003));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test546() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0606601717798212, -105.0),
				new WheelVector(1.0606601717798212, -105.0),
				new WheelVector(1.0606601717798212, -105.0),
				new WheelVector(1.0606601717798212, -105.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test547() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.373213921133975, -120.96375653207352),
				new WheelVector(3.181980515339464, 135.0),
				new WheelVector(5.303300858899107, -45.0),
				new WheelVector(4.373213921133975, 30.96375653207353));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test548() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.3661211157562425, -125.9353216114064),
				new WheelVector(3.824264635194589, 121.10211375198601),
				new WheelVector(4.860555523805895, -34.106605350869096),
				new WheelVector(5.188374372966926, 39.133261210456055));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test549() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.3661211157562425, -144.0646783885936),
				new WheelVector(4.860555523805895, 124.1066053508691),
				new WheelVector(3.824264635194589, -31.10211375198602),
				new WheelVector(5.188374372966926, 50.86673878954395));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test550() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.373213921133975, -149.03624346792648),
				new WheelVector(5.303300858899107, 135.0),
				new WheelVector(3.181980515339464, -45.0),
				new WheelVector(4.373213921133975, 59.03624346792648));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test551() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.188374372966926, -140.86673878954397),
				new WheelVector(4.860555523805895, 145.8933946491309),
				new WheelVector(3.8242646351945884, -58.89788624801398),
				new WheelVector(3.366121115756243, 54.064678388593606));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test552() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.188374372966926, -129.13326121045606),
				new WheelVector(3.824264635194589, 148.897886248014),
				new WheelVector(4.860555523805895, -55.893394649130904),
				new WheelVector(3.3661211157562425, 35.9353216114064));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test553() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.551315688243536, -127.87498365109822),
				new WheelVector(7.424621202458749, 135.0),
				new WheelVector(9.545941546018392, -45.0),
				new WheelVector(8.551315688243536, 37.8749836510982));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test554() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.585284617723985, -130.9908576916628),
				new WheelVector(8.007808689023483, 128.41322444637055),
				new WheelVector(9.06228448019593, -39.18247435555642),
				new WheelVector(9.418782154191693, 41.7722202823692));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test555() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.585284617723985, -139.0091423083372),
				new WheelVector(9.06228448019593, 129.18247435555642),
				new WheelVector(8.007808689023483, -38.41322444637054),
				new WheelVector(9.418782154191693, 48.22777971763081));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test556() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.551315688243536, -142.12501634890182),
				new WheelVector(9.545941546018392, 135.0),
				new WheelVector(7.424621202458749, -45.0),
				new WheelVector(8.551315688243536, 52.1250163489018));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test557() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.41878215419169, -138.22777971763082),
				new WheelVector(9.06228448019593, 140.81752564444358),
				new WheelVector(8.007808689023483, -51.58677555362946),
				new WheelVector(7.585284617723985, 49.009142308337196));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test558() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.418782154191693, -131.7722202823692),
				new WheelVector(8.007808689023483, 141.58677555362948),
				new WheelVector(9.06228448019593, -50.81752564444358),
				new WheelVector(7.585284617723985, 40.99085769166281));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test559() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.772039774444801, -130.2363583092738),
				new WheelVector(11.667261889578034, 135.0),
				new WheelVector(13.788582233137676, -45.0),
				new WheelVector(12.772039774444801, 40.23635830927382));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test560() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.821265334041875, -132.4287120211297),
				new WheelVector(12.232129822725067, 130.69338090449855),
				new WheelVector(13.290033860002012, -41.036765032550214),
				new WheelVector(13.656781681720618, 42.77448901203474));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test561() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.821265334041875, -137.5712879788703),
				new WheelVector(13.290033860002012, 131.03676503255022),
				new WheelVector(12.232129822725067, -40.69338090449856),
				new WheelVector(13.656781681720618, 47.225510987965265));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test562() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.772039774444801, -139.7636416907262),
				new WheelVector(13.788582233137676, 135.0),
				new WheelVector(11.667261889578034, -45.0),
				new WheelVector(12.772039774444801, 49.76364169072618));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test563() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.656781681720618, -137.22551098796527),
				new WheelVector(13.290033860002012, 138.9632349674498),
				new WheelVector(12.232129822725067, -49.306619095501446),
				new WheelVector(11.821265334041875, 47.571287978870295));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test564() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.656781681720618, -132.77448901203473),
				new WheelVector(12.232129822725067, 139.30661909550145),
				new WheelVector(13.290033860002012, -48.963234967449786),
				new WheelVector(11.821265334041875, 42.428712021129705));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test565() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.003676073131953, -131.42366562500263),
				new WheelVector(15.90990257669732, 135.0),
				new WheelVector(18.031222920256962, -45.0),
				new WheelVector(17.003676073131953, 41.423665625002656));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test566() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.06076229398095, -133.10773613422577),
				new WheelVector(16.465873800075112, 131.80206040095035),
				new WheelVector(17.524982168321884, -41.99550840111693),
				new WheelVector(17.896980598308748, 43.30194126363461));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test567() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.06076229398095, -136.8922638657742),
				new WheelVector(17.524982168321884, 131.99550840111692),
				new WheelVector(16.465873800075112, -41.80206040095035),
				new WheelVector(17.896980598308748, 46.69805873636539));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test568() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.003676073131953, -138.57633437499737),
				new WheelVector(18.031222920256962, 135.0),
				new WheelVector(15.90990257669732, -45.0),
				new WheelVector(17.003676073131953, 48.57633437499735));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test569() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.896980598308748, -136.6980587363654),
				new WheelVector(17.524982168321884, 138.00449159888308),
				new WheelVector(16.465873800075112, -48.197939599049654),
				new WheelVector(16.06076229398095, 46.892263865774225));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test570() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.896980598308748, -133.30194126363463),
				new WheelVector(16.465873800075112, 138.19793959904965),
				new WheelVector(17.524982168321884, -48.00449159888308),
				new WheelVector(16.06076229398095, 43.10773613422578));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test571() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, -36.86989764584401),
				new WheelVector(1.25, -36.86989764584401),
				new WheelVector(1.25, -36.86989764584401),
				new WheelVector(1.25, -36.86989764584401));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test572() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, 23.13010235415597),
				new WheelVector(1.25, 23.13010235415597),
				new WheelVector(1.25, 23.13010235415597),
				new WheelVector(1.25, 23.13010235415597));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test573() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, 83.13010235415598),
				new WheelVector(1.25, 83.13010235415598),
				new WheelVector(1.25, 83.13010235415598),
				new WheelVector(1.25, 83.13010235415598));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test574() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, 143.13010235415598),
				new WheelVector(1.25, 143.13010235415598),
				new WheelVector(1.25, 143.13010235415598),
				new WheelVector(1.25, 143.13010235415598));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test575() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, -156.86989764584405),
				new WheelVector(1.25, -156.86989764584405),
				new WheelVector(1.25, -156.86989764584405),
				new WheelVector(1.25, -156.86989764584405));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test576() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.2500000000000002, -96.86989764584402),
				new WheelVector(1.2500000000000002, -96.86989764584402),
				new WheelVector(1.2500000000000002, -96.86989764584402),
				new WheelVector(1.2500000000000002, -96.86989764584402));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 0.75, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test577() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.25, -118.07248693585296),
				new WheelVector(3.010398644698074, 131.63353933657018),
				new WheelVector(5.482928049865327, -43.1523897340054),
				new WheelVector(4.589389937671455, 29.357753542791276));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test578() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.1175684852563217, -126.41043385319632),
				new WheelVector(3.9511438983763494, 117.92663252618823),
				new WheelVector(4.849068147007561, -31.158931161839604),
				new WheelVector(5.422708432115505, 40.07418506563083));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test579() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.349512391418099, -148.3220971878183),
				new WheelVector(5.1099450198291425, 123.90586451100882),
				new WheelVector(3.6074176212802618, -29.182917555144527),
				new WheelVector(5.2825909116395335, 53.40125714518249));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test580() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.589389937671455, -150.64224645720873),
				new WheelVector(5.482928049865327, 136.8476102659946),
				new WheelVector(3.010398644698074, -48.3664606634298),
				new WheelVector(4.25, 61.92751306414704));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test581() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.422708432115505, -139.92581493436919),
				new WheelVector(4.849068147007562, 148.8410688381604),
				new WheelVector(3.951143898376349, -62.0733674738118),
				new WheelVector(3.117568485256322, 53.58956614680369));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test582() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.282590911639534, -126.5987428548175),
				new WheelVector(3.6074176212802618, 150.8170824448555),
				new WheelVector(5.109945019829143, -56.09413548899119),
				new WheelVector(3.349512391418099, 31.6779028121817));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 0.75, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test583() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.40014880820572, -126.52885536698517),
				new WheelVector(7.25, 133.60281897270363),
				new WheelVector(9.724325169388361, -43.958373323990024),
				new WheelVector(8.75, 36.86989764584401));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test584() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.340024967295873, -131.36291543224567),
				new WheelVector(8.10312138693191, 126.76927628219674),
				new WheelVector(9.025764443450022, -37.61561007190131),
				new WheelVector(9.65655391324841, 42.23620713840137));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test585() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.541615643913895, -140.87395392250068),
				new WheelVector(9.309166246842588, 128.93693022207103),
				new WheelVector(7.775887331272662, -37.7354825516092),
				new WheelVector(9.499949130362394, 49.66006040208254));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test586() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.75, -143.13010235415598),
				new WheelVector(9.724325169388361, 136.04162667600997),
				new WheelVector(7.25, -46.39718102729638),
				new WheelVector(8.40014880820572, 53.47114463301483));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test587() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.65655391324841, -137.76379286159863),
				new WheelVector(9.025764443450022, 142.3843899280987),
				new WheelVector(8.10312138693191, -53.23072371780326),
				new WheelVector(7.340024967295873, 48.637084567754336));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test588() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.499949130362396, -130.33993959791746),
				new WheelVector(7.775887331272662, 142.26451744839082),
				new WheelVector(9.309166246842588, -51.06306977792899),
				new WheelVector(7.541615643913894, 39.12604607749932));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 0.75, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test589() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.61199825562944, -129.36931724236476),
				new WheelVector(11.491844934561204, 134.11859600341788),
				new WheelVector(13.966477723463422, -44.27477570094075),
				new WheelVector(12.963892162464173, 39.52263127117112));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test590() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.577249232040838, -132.69499965117623),
				new WheelVector(12.31704568137303, 129.59577738723064),
				new WheelVector(13.244447352870939, -39.97520157015438),
				new WheelVector(13.895765549951173, 43.07974876651285));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test591() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.769991494507979, -138.7598410926732),
				new WheelVector(13.535494609249785, 130.83417435147794),
				new WheelVector(11.996473885395243, -40.298609140360085),
				new WheelVector(13.732891182093079, 48.22181661781329));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test592() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.963892162464173, -140.47736872882888),
				new WheelVector(13.966477723463422, 135.72522429905925),
				new WheelVector(11.491844934561204, -45.88140399658214),
				new WheelVector(12.61199825562944, 50.63068275763526));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test593() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.895765549951172, -136.92025123348714),
				new WheelVector(13.24444735287094, 140.02479842984562),
				new WheelVector(12.317045681373028, -50.404222612769345),
				new WheelVector(11.57724923204084, 47.30500034882377));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test594() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.732891182093079, -131.7781833821867),
				new WheelVector(11.996473885395243, 139.70139085963993),
				new WheelVector(13.535494609249785, -49.16582564852209),
				new WheelVector(11.769991494507979, 41.24015890732678));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 0.75, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test595() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.83931411904891, -130.78582147726596),
				new WheelVector(15.734118977559563, 134.35625428582463),
				new WheelVector(18.208857734630143, -44.44374777291932),
				new WheelVector(17.191931246954194, 40.87240829748828));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test596() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.817377565230387, -133.3131071857452),
				new WheelVector(16.54565358100751, 130.97961023738046),
				new WheelVector(17.474734549551627, -41.193686602831455),
				new WheelVector(18.13658090597416, 43.528868388385156));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test597() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.005918687818376, -137.76389629011987),
				new WheelVector(17.76959910697781, 131.82797386911602),
				new WheelVector(16.228565789289373, -41.526410898876684),
				new WheelVector(17.97040809105198, 47.46155514956255));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test598() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.191931246954194, -139.12759170251172),
				new WheelVector(18.208857734630143, 135.55625222708068),
				new WheelVector(15.734118977559563, -45.64374571417538),
				new WheelVector(16.83931411904891, 49.214178522734045));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test599() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.136580905974157, -136.47113161161485),
				new WheelVector(17.474734549551627, 138.80631339716857),
				new WheelVector(16.545653581007507, -49.02038976261956),
				new WheelVector(15.817377565230387, 46.68689281425481));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test600() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.97040809105198, -132.53844485043746),
				new WheelVector(16.228565789289373, 138.47358910112334),
				new WheelVector(17.76959910697781, -48.17202613088399),
				new WheelVector(16.005918687818376, 42.23610370988011));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 0.75, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test601() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, -90.0),
				new WheelVector(1.0, -90.0),
				new WheelVector(1.0, -90.0),
				new WheelVector(1.0, -90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test602() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, -30.00000000000001),
				new WheelVector(1.0, -30.00000000000001),
				new WheelVector(1.0, -30.00000000000001),
				new WheelVector(1.0, -30.00000000000001));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test603() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(0.9999999999999999, 29.999999999999993),
				new WheelVector(0.9999999999999999, 29.999999999999993),
				new WheelVector(0.9999999999999999, 29.999999999999993),
				new WheelVector(0.9999999999999999, 29.999999999999993));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test604() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, 90.0),
				new WheelVector(1.0, 90.0),
				new WheelVector(1.0, 90.0),
				new WheelVector(1.0, 90.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test605() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, 149.99999999999997),
				new WheelVector(1.0, 149.99999999999997),
				new WheelVector(1.0, 149.99999999999997),
				new WheelVector(1.0, 149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test606() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0, -149.99999999999997),
				new WheelVector(1.0, -149.99999999999997),
				new WheelVector(1.0, -149.99999999999997),
				new WheelVector(1.0, -149.99999999999997));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test607() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.0, -126.86989764584402),
				new WheelVector(3.605551275463989, 146.30993247402023),
				new WheelVector(5.0, -53.13010235415599),
				new WheelVector(3.605551275463989, 33.690067525979785));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test608() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.099249635883788, -121.37095559632654),
				new WheelVector(3.2869206831460613, 130.48373458835414),
				new WheelVector(5.21499304148209, -42.15525346388914),
				new WheelVector(4.60392793413479, 32.88909121976267));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test609() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.286920683146061, -130.4837345883541),
				new WheelVector(4.099249635883788, 121.37095559632654),
				new WheelVector(4.60392793413479, -32.88909121976267),
				new WheelVector(5.214993041482091, 42.15525346388914));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test610() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.605551275463989, -146.30993247402023),
				new WheelVector(5.0, 126.86989764584402),
				new WheelVector(3.605551275463989, -33.690067525979785),
				new WheelVector(5.0, 53.13010235415599));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test611() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.60392793413479, -147.11090878023734),
				new WheelVector(5.214993041482091, 137.84474653611088),
				new WheelVector(3.286920683146061, -49.51626541164588),
				new WheelVector(4.099249635883789, 58.62904440367347));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test612() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.21499304148209, -137.84474653611088),
				new WheelVector(4.60392793413479, 147.11090878023734),
				new WheelVector(4.099249635883788, -58.62904440367347),
				new WheelVector(3.2869206831460613, 49.51626541164588));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test613() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.219544457292887, -130.6012946450045),
				new WheelVector(7.810249675906654, 140.19442890773482),
				new WheelVector(9.219544457292887, -49.398705354995535),
				new WheelVector(7.810249675906654, 39.8055710922652));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test614() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.282976225644182, -128.3031698039136),
				new WheelVector(7.5238085538234385, 133.02863601373085),
				new WheelVector(9.454750385145726, -43.431360845766406),
				new WheelVector(8.797289630642682, 38.69632203054232));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test615() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.5238085538234385, -133.02863601373085),
				new WheelVector(8.282976225644182, 128.3031698039136),
				new WheelVector(8.797289630642682, -38.69632203054232),
				new WheelVector(9.454750385145726, 43.431360845766406));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test616() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.810249675906654, -140.19442890773482),
				new WheelVector(9.219544457292887, 130.6012946450045),
				new WheelVector(7.810249675906654, -39.8055710922652),
				new WheelVector(9.219544457292887, 49.398705354995535));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test617() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.797289630642682, -141.30367796945768),
				new WheelVector(9.454750385145726, 136.56863915423358),
				new WheelVector(7.5238085538234385, -46.97136398626916),
				new WheelVector(8.282976225644182, 51.696830196086424));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test618() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.454750385145726, -136.56863915423358),
				new WheelVector(8.797289630642682, 141.30367796945768),
				new WheelVector(8.282976225644182, -51.696830196086424),
				new WheelVector(7.5238085538234385, 46.97136398626916));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test619() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.45362404707371, -131.98721249581666),
				new WheelVector(12.041594578792296, 138.3664606634298),
				new WheelVector(13.45362404707371, -48.01278750418334),
				new WheelVector(12.041594578792296, 41.6335393365702));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test620() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.506460039990538, -130.57039778625457),
				new WheelVector(11.764843506476408, 133.7394277407738),
				new WheelVector(13.696293559504333, -43.91721642799477),
				new WheelVector(13.022613304099908, 40.74629573479472));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test621() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.764843506476408, -133.7394277407738),
				new WheelVector(12.506460039990538, 130.57039778625457),
				new WheelVector(13.022613304099908, -40.74629573479472),
				new WheelVector(13.696293559504333, 43.91721642799477));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test622() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.041594578792296, -138.3664606634298),
				new WheelVector(13.45362404707371, 131.98721249581666),
				new WheelVector(12.041594578792296, -41.6335393365702),
				new WheelVector(13.45362404707371, 48.01278750418334));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test623() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.022613304099906, -139.25370426520527),
				new WheelVector(13.696293559504333, 136.0827835720052),
				new WheelVector(11.76484350647641, -46.26057225922621),
				new WheelVector(12.506460039990538, 49.42960221374543));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test624() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.696293559504333, -136.0827835720052),
				new WheelVector(13.022613304099908, 139.2537042652053),
				new WheelVector(12.506460039990538, -49.42960221374544),
				new WheelVector(11.764843506476408, 46.26057225922621));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test625() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.69180601295413, -132.70938995736148),
				new WheelVector(16.278820596099706, 137.48955292199915),
				new WheelVector(17.69180601295413, -47.29061004263853),
				new WheelVector(16.278820596099706, 42.510447078000844));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test626() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.739635309921585, -131.69202880239104),
				new WheelVector(16.00672953195541, 134.07352184776926),
				new WheelVector(17.938355824624132, -44.173293603586856),
				new WheelVector(17.256436761128484, 41.79120232446414));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test627() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.00672953195541, -134.07352184776926),
				new WheelVector(16.739635309921585, 131.69202880239104),
				new WheelVector(17.256436761128484, -41.79120232446414),
				new WheelVector(17.938355824624132, 44.173293603586856));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test628() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.278820596099706, -137.48955292199915),
				new WheelVector(17.69180601295413, 132.70938995736148),
				new WheelVector(16.278820596099706, -42.510447078000844),
				new WheelVector(17.69180601295413, 47.29061004263853));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test629() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.256436761128484, -138.20879767553586),
				new WheelVector(17.938355824624132, 135.82670639641313),
				new WheelVector(16.00672953195541, -45.92647815223074),
				new WheelVector(16.739635309921585, 48.30797119760897));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test630() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.938355824624132, -135.82670639641313),
				new WheelVector(17.256436761128484, 138.20879767553586),
				new WheelVector(16.739635309921585, -48.30797119760897),
				new WheelVector(16.00672953195541, 45.92647815223074));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test631() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, -75.96375653207353),
				new WheelVector(1.0307764064044151, -75.96375653207353),
				new WheelVector(1.0307764064044151, -75.96375653207353),
				new WheelVector(1.0307764064044151, -75.96375653207353));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test632() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, -15.963756532073527),
				new WheelVector(1.0307764064044151, -15.963756532073527),
				new WheelVector(1.0307764064044151, -15.963756532073527),
				new WheelVector(1.0307764064044151, -15.963756532073527));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test633() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, 44.03624346792646),
				new WheelVector(1.0307764064044151, 44.03624346792646),
				new WheelVector(1.0307764064044151, 44.03624346792646),
				new WheelVector(1.0307764064044151, 44.03624346792646));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test634() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, 104.03624346792648),
				new WheelVector(1.0307764064044151, 104.03624346792648),
				new WheelVector(1.0307764064044151, 104.03624346792648),
				new WheelVector(1.0307764064044151, 104.03624346792648));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test635() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, 164.03624346792645),
				new WheelVector(1.0307764064044151, 164.03624346792645),
				new WheelVector(1.0307764064044151, 164.03624346792645),
				new WheelVector(1.0307764064044151, 164.03624346792645));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test636() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.0307764064044151, -135.96375653207352),
				new WheelVector(1.0307764064044151, -135.96375653207352),
				new WheelVector(1.0307764064044151, -135.96375653207352),
				new WheelVector(1.0307764064044151, -135.96375653207352));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test637() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.8541219597369, -124.50852298766841),
				new WheelVector(3.400367627183861, 143.9726266148964),
				new WheelVector(5.153882032022076, -50.9061411137705),
				new WheelVector(3.816084380618437, 31.6075022462489));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test638() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.8493258463809883, -121.45998581788825),
				new WheelVector(3.3786662580033004, 126.48453648109466),
				new WheelVector(5.168134510346066, -39.4447908592269),
				new WheelVector(4.827803903265261, 34.24130724728142));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test639() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.2120568910927947, -134.69073540505067),
				new WheelVector(4.349182185534428, 121.29215772388345),
				new WheelVector(4.3828774015514025, -31.39957587637284),
				new WheelVector(5.273299776077906, 44.81162223245845));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test640() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.816084380618437, -148.39249775375112),
				new WheelVector(5.153882032022076, 129.0938588862295),
				new WheelVector(3.400367627183861, -36.02737338510361),
				new WheelVector(4.8541219597369, 55.4914770123316));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test641() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.827803903265261, -145.7586927527186),
				new WheelVector(5.168134510346066, 140.55520914077312),
				new WheelVector(3.3786662580033004, -53.51546351890534),
				new WheelVector(3.8493258463809883, 58.540014182111754));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test642() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.273299776077906, -135.18837776754154),
				new WheelVector(4.3828774015514025, 148.60042412362716),
				new WheelVector(4.349182185534429, -58.70784227611657),
				new WheelVector(3.2120568910927947, 45.309264594949326));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test643() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.058835465996719, -129.40066066347944),
				new WheelVector(7.6198753270640855, 138.9909130984298),
				new WheelVector(9.38416218956173, -48.23970029610213),
				new WheelVector(8.00390529679106, 38.65980825409009));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test644() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.035677877020296, -128.56058945216327),
				new WheelVector(7.600544149331681, 131.22581655347815),
				new WheelVector(9.399825989562784, -41.949022407641216),
				new WheelVector(9.030663378554566, 39.27259586540695));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test645() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.454670948018659, -134.8667450847693),
				new WheelVector(8.530432073813145, 128.06068025932532),
				new WheelVector(8.564854268115713, -38.088705758561694),
				new WheelVector(9.51592775596613, 44.89560963210535));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test646() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.00390529679106, -141.34019174590992),
				new WheelVector(9.38416218956173, 131.76029970389789),
				new WheelVector(7.6198753270640855, -41.00908690157022),
				new WheelVector(9.058835465996719, 50.59933933652057));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test647() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.030663378554566, -140.72740413459306),
				new WheelVector(9.399825989562784, 138.0509775923588),
				new WheelVector(7.600544149331681, -48.77418344652183),
				new WheelVector(8.035677877020296, 51.43941054783674));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test648() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.51592775596613, -135.10439036789467),
				new WheelVector(8.564854268115713, 141.9112942414383),
				new WheelVector(8.530432073813147, -51.93931974067469),
				new WheelVector(7.454670948018659, 45.13325491523069));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test649() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.287682265918312, -131.18592516570965),
				new WheelVector(11.855905701379376, 137.563770211465),
				new WheelVector(13.622132725825278, -47.23117460803125),
				new WheelVector(12.22957480863501, 40.8553762588957));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test650() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.26078824606518, -130.78471031364114),
				new WheelVector(11.83727827876451, 132.57768233705968),
				new WheelVector(13.63832258568076, -42.89772239706372),
				new WheelVector(13.258886513774447, 41.10253796802871));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test651() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.697304322571508, -134.91507692832096),
				new WheelVector(12.752300068964425, 130.36434554161386),
				new WheelVector(12.78686212294048, -40.376902713674646),
				new WheelVector(13.758563572740794, 44.92779980937933));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test652() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.22957480863501, -139.1446237411043),
				new WheelVector(13.622132725825278, 132.76882539196876),
				new WheelVector(11.855905701379376, -42.436229788535),
				new WheelVector(13.287682265918312, 48.81407483429035));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test653() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.258886513774446, -138.8974620319713),
				new WheelVector(13.638322585680761, 137.10227760293628),
				new WheelVector(11.837278278764508, -47.422317662940316),
				new WheelVector(12.260788246065182, 49.215289686358865));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test654() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.758563572740794, -135.0722001906207),
				new WheelVector(12.78686212294048, 139.62309728632536),
				new WheelVector(12.752300068964425, -49.635654458386156),
				new WheelVector(11.697304322571508, 45.084923071679036));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test655() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.523198908875056, -132.10873040377945),
				new WheelVector(16.095418602819873, 136.88818800674093),
				new WheelVector(17.86232067789625, -46.701354605326124),
				new WheelVector(16.463975826026957, 41.92254460057563));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.25, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test656() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.494900360004205, -131.86800847602086),
				new WheelVector(16.077127937908564, 133.21673772792724),
				new WheelVector(17.878785117230976, -43.39648782793554),
				new WheelVector(17.494092206042964, 42.04705854799396));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.25, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test657() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.939941589807248, -134.93768039613008),
				new WheelVector(16.984523623931292, 131.5211222178533),
				new WheelVector(17.01913503290105, -41.52820580912123),
				new WheelVector(18.001201685263492, 44.944816417222235));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.25, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test658() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.463975826026957, -138.0774553994244),
				new WheelVector(17.86232067789625, 133.29864539467388),
				new WheelVector(16.095418602819873, -43.111811993259074),
				new WheelVector(17.523198908875056, 47.89126959622057));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.25, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test659() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.494092206042964, -137.95294145200606),
				new WheelVector(17.87878511723098, 136.60351217206446),
				new WheelVector(16.077127937908564, -46.783262272072754),
				new WheelVector(16.494900360004205, 48.13199152397915));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.25, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test660() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.001201685263492, -135.05518358277777),
				new WheelVector(17.01913503290105, 138.4717941908788),
				new WheelVector(16.984523623931292, -48.4788777821467),
				new WheelVector(15.939941589807248, 45.06231960386991));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.25, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test661() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, -63.43494882292201),
				new WheelVector(1.118033988749895, -63.43494882292201),
				new WheelVector(1.118033988749895, -63.43494882292201),
				new WheelVector(1.118033988749895, -63.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test662() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, -3.434948822922018),
				new WheelVector(1.118033988749895, -3.434948822922018),
				new WheelVector(1.118033988749895, -3.434948822922018),
				new WheelVector(1.118033988749895, -3.434948822922018));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test663() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, 56.565051177077976),
				new WheelVector(1.118033988749895, 56.565051177077976),
				new WheelVector(1.118033988749895, 56.565051177077976),
				new WheelVector(1.118033988749895, 56.565051177077976));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test664() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, 116.56505117707799),
				new WheelVector(1.118033988749895, 116.56505117707799),
				new WheelVector(1.118033988749895, 116.56505117707799),
				new WheelVector(1.118033988749895, 116.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test665() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, 176.56505117707798),
				new WheelVector(1.118033988749895, 176.56505117707798),
				new WheelVector(1.118033988749895, 176.56505117707798),
				new WheelVector(1.118033988749895, 176.56505117707798));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test666() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.118033988749895, -123.43494882292201),
				new WheelVector(1.118033988749895, -123.43494882292201),
				new WheelVector(1.118033988749895, -123.43494882292201),
				new WheelVector(1.118033988749895, -123.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test667() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.716990566028302, -122.00538320808352),
				new WheelVector(3.2015621187164243, 141.34019174590992),
				new WheelVector(5.315072906367325, -48.81407483429036),
				new WheelVector(4.031128874149275, 29.74488129694222));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test668() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.5994126417986663, -121.56137934601641),
				new WheelVector(3.485960956271123, 122.71402354727958),
				new WheelVector(5.133037717702191, -36.69101926155491),
				new WheelVector(5.054129859239862, 35.4730537447074));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test669() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.1552767495007554, -139.07359626136613),
				new WheelVector(4.599122067160937, 121.22192429144299),
				new WheelVector(4.165102184983379, -29.75308741311582),
				new WheelVector(5.3426799112486565, 47.40446146370343));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test670() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.031128874149275, -150.2551187030578),
				new WheelVector(5.315072906367325, 131.18592516570965),
				new WheelVector(3.2015621187164243, -38.65980825409009),
				new WheelVector(4.716990566028302, 57.9946167919165));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test671() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.054129859239861, -144.52694625529261),
				new WheelVector(5.133037717702191, 143.3089807384451),
				new WheelVector(3.4859609562711227, -57.28597645272043),
				new WheelVector(3.5994126417986667, 58.4386206539836));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test672() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.3426799112486565, -132.59553853629657),
				new WheelVector(4.165102184983378, 150.24691258688418),
				new WheelVector(4.599122067160937, -58.77807570855703),
				new WheelVector(3.1552767495007554, 40.92640373863385));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test673() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.902246907382429, -128.15722658736905),
				new WheelVector(7.433034373659253, 137.72631099390625),
				new WheelVector(9.5524865872714, -47.12109639666146),
				new WheelVector(8.200609733428363, 37.568592028827496));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test674() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.788552030504778, -128.8343504487846),
				new WheelVector(7.684650127188183, 129.4607426066998),
				new WheelVector(9.351264749899162, -40.45027597072923),
				new WheelVector(9.264904601134319, 39.81978330439611));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test675() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.39334448892246, -136.73730113260862),
				new WheelVector(8.778032101632652, 127.83186650559577),
				new WheelVector(8.33343581139896, -37.44726711130881),
				new WheelVector(9.583238349750042, 46.34022220700253));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test676() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.200609733428363, -142.43140797117252),
				new WheelVector(9.5524865872714, 132.87890360333856),
				new WheelVector(7.433034373659253, -42.27368900609374),
				new WheelVector(8.902246907382429, 51.84277341263095));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test677() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.264904601134319, -140.1802166956039),
				new WheelVector(9.351264749899162, 139.54972402927078),
				new WheelVector(7.684650127188183, -50.539257393300204),
				new WheelVector(7.788552030504778, 51.165649551215424));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test678() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.583238349750042, -133.65977779299746),
				new WheelVector(8.33343581139896, 142.5527328886912),
				new WheelVector(8.778032101632652, -52.16813349440425),
				new WheelVector(7.39334448892246, 43.262698867391364));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test679() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.124404748406688, -130.36453657309735),
				new WheelVector(11.672617529928752, 136.7357045889284),
				new WheelVector(13.793114224133722, -46.46880071438583),
				new WheelVector(12.419742348374221, 40.10090754621224));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test680() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.015295006691272, -131.00778361977),
				new WheelVector(11.914519351024616, 131.43053329309618),
				new WheelVector(13.584705688164908, -41.86985311476962),
				new WheelVector(13.495654333976542, 41.44629327417806));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test681() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.634745983381853, -136.10387387843454),
				new WheelVector(12.998298787377525, 130.1660900780736),
				new WheelVector(12.551662385280284, -39.99364949419328),
				new WheelVector(13.825074535140121, 45.92896861415424));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test682() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.419742348374221, -139.89909245378777),
				new WheelVector(13.793114224133722, 133.53119928561418),
				new WheelVector(11.672617529928752, -43.264295411071615),
				new WheelVector(13.124404748406688, 49.635463426902646));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test683() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.495654333976542, -138.55370672582194),
				new WheelVector(13.584705688164908, 138.13014688523037),
				new WheelVector(11.914519351024616, -48.569466706903846),
				new WheelVector(12.015295006691272, 48.992216380229976));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test684() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.825074535140121, -134.07103138584577),
				new WheelVector(12.551662385280284, 140.00635050580672),
				new WheelVector(12.998298787377525, -49.833909921926406),
				new WheelVector(11.634745983381853, 43.89612612156546));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test685() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.356554957709783, -131.49646835521554),
				new WheelVector(15.913830462839549, 136.27303002005672),
				new WheelVector(18.034688796871432, -46.12330271407543),
				new WheelVector(16.650825805346713, 41.34777721969367));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.5, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test686() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.250325703313155, -132.04928704824343),
				new WheelVector(16.151089596512886, 132.36761219402197),
				new WheelVector(17.822522404121514, -42.61463306788621),
				new WheelVector(17.732087145517863, 42.29605156998708));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.5, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test687() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.87680967523892, -135.8089108925579),
				new WheelVector(17.22955876262032, 131.35507538526764),
				new WheelVector(16.78220202611723, -41.25777743257203),
				new WheelVector(18.067288521973623, 45.71083312152319));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.5, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test688() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.650825805346713, -138.65222278030632),
				new WheelVector(18.034688796871432, 133.87669728592456),
				new WheelVector(15.913830462839549, -43.72696997994329),
				new WheelVector(17.356554957709783, 48.503531644784466));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.5, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test689() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.732087145517863, -137.70394843001293),
				new WheelVector(17.822522404121514, 137.38536693211378),
				new WheelVector(16.151089596512886, -47.63238780597802),
				new WheelVector(16.250325703313155, 47.95071295175657));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.5, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test690() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.067288521973623, -134.2891668784768),
				new WheelVector(16.78220202611723, 138.74222256742797),
				new WheelVector(17.22955876262032, -48.64492461473235),
				new WheelVector(15.87680967523892, 44.191089107442124));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.5, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test691() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, -53.13010235415599),
				new WheelVector(1.25, -53.13010235415599),
				new WheelVector(1.25, -53.13010235415599),
				new WheelVector(1.25, -53.13010235415599));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test692() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.2500000000000002, 6.869897645844016),
				new WheelVector(1.2500000000000002, 6.869897645844016),
				new WheelVector(1.2500000000000002, 6.869897645844016),
				new WheelVector(1.2500000000000002, 6.869897645844016));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test693() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, 66.869897645844),
				new WheelVector(1.25, 66.869897645844),
				new WheelVector(1.25, 66.869897645844),
				new WheelVector(1.25, 66.869897645844));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test694() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, 126.86989764584402),
				new WheelVector(1.25, 126.86989764584402),
				new WheelVector(1.25, 126.86989764584402),
				new WheelVector(1.25, 126.86989764584402));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test695() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, -173.13010235415604),
				new WheelVector(1.25, -173.13010235415604),
				new WheelVector(1.25, -173.13010235415604),
				new WheelVector(1.25, -173.13010235415604));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test696() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.25, -113.13010235415598),
				new WheelVector(1.25, -113.13010235415598),
				new WheelVector(1.25, -113.13010235415598),
				new WheelVector(1.25, -113.13010235415598));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test697() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.589389937671455, -119.35775354279127),
				new WheelVector(3.010398644698074, 138.3664606634298),
				new WheelVector(5.482928049865327, -46.847610265994604),
				new WheelVector(4.25, 28.072486935852957));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test698() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.349512391418099, -121.67790281218173),
				new WheelVector(3.6074176212802618, 119.18291755514453),
				new WheelVector(5.109945019829143, -33.905864511008815),
				new WheelVector(5.282590911639534, 36.59874285481751));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test699() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.1175684852563212, -143.5895661468037),
				new WheelVector(4.849068147007561, 121.15893116183962),
				new WheelVector(3.95114389837635, -27.926632526188204),
				new WheelVector(5.422708432115506, 49.92581493436917));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test700() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.25, -151.92751306414706),
				new WheelVector(5.482928049865327, 133.1523897340054),
				new WheelVector(3.010398644698074, -41.6335393365702),
				new WheelVector(4.589389937671455, 60.64224645720873));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test701() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.282590911639534, -143.40125714518248),
				new WheelVector(5.109945019829143, 146.09413548899118),
				new WheelVector(3.607417621280261, -60.81708244485548),
				new WheelVector(3.3495123914181, 58.322097187818315));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test702() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.422708432115505, -130.07418506563084),
				new WheelVector(3.9511438983763494, 152.0733674738118),
				new WheelVector(4.849068147007561, -58.84106883816041),
				new WheelVector(3.1175684852563217, 36.41043385319632));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test703() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.75, -126.86989764584402),
				new WheelVector(7.25, 136.39718102729637),
				new WheelVector(9.724325169388361, -46.041626676009976),
				new WheelVector(8.40014880820572, 36.52885536698517));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test704() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.541615643913894, -129.12604607749932),
				new WheelVector(7.775887331272662, 127.73548255160918),
				new WheelVector(9.309166246842588, -38.93693022207101),
				new WheelVector(9.499949130362396, 40.33993959791746));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test705() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.340024967295873, -138.63708456775433),
				new WheelVector(9.025764443450022, 127.61561007190129),
				new WheelVector(8.10312138693191, -36.769276282196735),
				new WheelVector(9.656553913248413, 47.76379286159863));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test706() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.40014880820572, -143.47114463301483),
				new WheelVector(9.724325169388361, 133.95837332399003),
				new WheelVector(7.25, -43.60281897270362),
				new WheelVector(8.75, 53.13010235415599));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test707() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.499949130362394, -139.66006040208256),
				new WheelVector(9.309166246842588, 141.063069777929),
				new WheelVector(7.775887331272661, -52.264517448390805),
				new WheelVector(7.541615643913895, 50.87395392250069));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test708() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.65655391324841, -132.23620713840137),
				new WheelVector(8.10312138693191, 143.23072371780327),
				new WheelVector(9.025764443450022, -52.3843899280987),
				new WheelVector(7.340024967295873, 41.362915432245664));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test709() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.963892162464173, -129.52263127117112),
				new WheelVector(11.491844934561204, 135.88140399658215),
				new WheelVector(13.966477723463422, -45.72522429905925),
				new WheelVector(12.61199825562944, 39.36931724236474));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test710() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.769991494507979, -131.2401589073268),
				new WheelVector(11.996473885395243, 130.29860914036007),
				new WheelVector(13.535494609249785, -40.83417435147792),
				new WheelVector(13.732891182093079, 41.77818338218671));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test711() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.577249232040838, -137.30500034882377),
				new WheelVector(13.244447352870939, 129.97520157015438),
				new WheelVector(12.31704568137303, -39.59577738723065),
				new WheelVector(13.895765549951173, 46.92025123348716));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test712() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.61199825562944, -140.63068275763524),
				new WheelVector(13.966477723463422, 134.27477570094075),
				new WheelVector(11.491844934561204, -44.11859600341786),
				new WheelVector(12.963892162464173, 50.47736872882888));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test713() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.732891182093079, -138.2218166178133),
				new WheelVector(13.535494609249785, 139.16582564852206),
				new WheelVector(11.996473885395243, -49.70139085963992),
				new WheelVector(11.769991494507979, 48.75984109267323));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test714() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.895765549951173, -133.07974876651286),
				new WheelVector(12.31704568137303, 140.40422261276936),
				new WheelVector(13.244447352870939, -50.02479842984562),
				new WheelVector(11.577249232040838, 42.694999651176246));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test715() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.191931246954194, -130.87240829748828),
				new WheelVector(15.734118977559563, 135.64374571417537),
				new WheelVector(18.208857734630143, -45.55625222708068),
				new WheelVector(16.83931411904891, 40.78582147726596));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.75, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test716() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.005918687818376, -132.23610370988013),
				new WheelVector(16.228565789289373, 131.52641089887666),
				new WheelVector(17.76959910697781, -41.82797386911601),
				new WheelVector(17.97040809105198, 42.53844485043745));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.75, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test717() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.817377565230387, -136.6868928142548),
				new WheelVector(17.474734549551627, 131.19368660283143),
				new WheelVector(16.54565358100751, -40.97961023738044),
				new WheelVector(18.13658090597416, 46.47113161161485));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.75, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test718() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(16.83931411904891, -139.21417852273404),
				new WheelVector(18.208857734630143, 134.44374777291932),
				new WheelVector(15.734118977559563, -44.35625428582462),
				new WheelVector(17.191931246954194, 49.12759170251172));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.75, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test719() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.97040809105198, -137.46155514956254),
				new WheelVector(17.76959910697781, 138.172026130884),
				new WheelVector(16.228565789289373, -48.47358910112332),
				new WheelVector(16.005918687818376, 47.76389629011989));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.75, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test720() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.13658090597416, -133.52886838838515),
				new WheelVector(16.54565358100751, 139.02038976261954),
				new WheelVector(17.474734549551627, -48.806313397168545),
				new WheelVector(15.817377565230387, 43.313107185745196));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 0.75, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test721() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.4142135623730951, -45.0),
				new WheelVector(1.4142135623730951, -45.0),
				new WheelVector(1.4142135623730951, -45.0),
				new WheelVector(1.4142135623730951, -45.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test722() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.4142135623730951, 14.999999999999996),
				new WheelVector(1.4142135623730951, 14.999999999999996),
				new WheelVector(1.4142135623730951, 14.999999999999996),
				new WheelVector(1.4142135623730951, 14.999999999999996));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test723() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.414213562373095, 74.99999999999999),
				new WheelVector(1.414213562373095, 74.99999999999999),
				new WheelVector(1.414213562373095, 74.99999999999999),
				new WheelVector(1.414213562373095, 74.99999999999999));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test724() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.4142135623730951, 135.0),
				new WheelVector(1.4142135623730951, 135.0),
				new WheelVector(1.4142135623730951, 135.0),
				new WheelVector(1.4142135623730951, 135.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test725() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.4142135623730951, -165.00000000000003),
				new WheelVector(1.4142135623730951, -165.00000000000003),
				new WheelVector(1.4142135623730951, -165.00000000000003),
				new WheelVector(1.4142135623730951, -165.00000000000003));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test726() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(1.4142135623730951, -105.0),
				new WheelVector(1.4142135623730951, -105.0),
				new WheelVector(1.4142135623730951, -105.0),
				new WheelVector(1.4142135623730951, -105.0));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.0, 1.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test727() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.47213595499958, -116.56505117707799),
				new WheelVector(2.8284271247461903, 135.0),
				new WheelVector(5.656854249492381, -45.0),
				new WheelVector(4.47213595499958, 26.56505117707799));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test728() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.0996282284472016, -121.81321456798648),
				new WheelVector(3.7416573867739413, 115.89339464913091),
				new WheelVector(5.099019513592785, -31.10211375198602),
				new WheelVector(5.512921625183263, 37.63074021243005));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test729() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(3.099628228447201, -148.18678543201352),
				new WheelVector(5.0990195135927845, 121.10211375198604),
				new WheelVector(3.7416573867739418, -25.893394649130908),
				new WheelVector(5.512921625183263, 52.369259787569945));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test730() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(4.47213595499958, -153.434948822922),
				new WheelVector(5.656854249492381, 135.0),
				new WheelVector(2.82842712474619, -45.0),
				new WheelVector(4.47213595499958, 63.43494882292201));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test731() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.512921625183263, -142.36925978756997),
				new WheelVector(5.099019513592785, 148.897886248014),
				new WheelVector(3.741657386773941, -64.10660535086909),
				new WheelVector(3.099628228447202, 58.18678543201354));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test732() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(5.512921625183263, -127.63074021243006),
				new WheelVector(3.7416573867739413, 154.1066053508691),
				new WheelVector(5.099019513592785, -58.89788624801398),
				new WheelVector(3.0996282284472016, 31.813214567986474));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.25, 1.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test733() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.602325267042627, -125.53767779197437),
				new WheelVector(7.0710678118654755, 135.0),
				new WheelVector(9.899494936611665, -45.0),
				new WheelVector(8.602325267042627, 35.53767779197438));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test734() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.294887957273468, -129.4374816976038),
				new WheelVector(7.87400787401181, 126.05172443537292),
				new WheelVector(9.273618495495704, -37.41091053102505),
				new WheelVector(9.73573878505512, 40.834939750994565));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test735() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(7.294887957273468, -140.5625183023962),
				new WheelVector(9.273618495495702, 127.41091053102505),
				new WheelVector(7.874007874011812, -36.05172443537292),
				new WheelVector(9.73573878505512, 49.16506024900543));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test736() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(8.602325267042627, -144.46232220802563),
				new WheelVector(9.899494936611665, 135.0),
				new WheelVector(7.0710678118654755, -45.0),
				new WheelVector(8.602325267042627, 54.46232220802562));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test737() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.73573878505512, -139.16506024900545),
				new WheelVector(9.273618495495706, 142.58908946897495),
				new WheelVector(7.874007874011809, -53.94827556462708),
				new WheelVector(7.294887957273469, 50.56251830239619));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test738() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(9.73573878505512, -130.83493975099458),
				new WheelVector(7.87400787401181, 143.94827556462707),
				new WheelVector(9.273618495495704, -52.58908946897495),
				new WheelVector(7.294887957273468, 39.43748169760382));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.5, 1.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test739() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.806248474865697, -128.6598082540901),
				new WheelVector(11.313708498984761, 135.0),
				new WheelVector(14.142135623730951, -45.0),
				new WheelVector(12.806248474865697, 38.65980825409009));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test740() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.524889824365358, -131.48242224694093),
				new WheelVector(12.083045973594572, 129.18247435555642),
				new WheelVector(13.490737563232042, -39.79128089714489),
				new WheelVector(13.970573164199092, 42.0987910228203));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test741() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(11.52488982436536, -138.5175777530591),
				new WheelVector(13.49073756323204, 129.7912808971449),
				new WheelVector(12.083045973594574, -39.18247435555642),
				new WheelVector(13.97057316419909, 47.9012089771797));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test742() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(12.806248474865697, -141.34019174590992),
				new WheelVector(14.142135623730951, 135.0),
				new WheelVector(11.313708498984761, -45.0),
				new WheelVector(12.806248474865697, 51.34019174590991));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test743() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.97057316419909, -137.90120897717972),
				new WheelVector(13.490737563232042, 140.20871910285513),
				new WheelVector(12.08304597359457, -50.81752564444357),
				new WheelVector(11.52488982436536, 48.51757775305909));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test744() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(13.970573164199092, -132.0987910228203),
				new WheelVector(12.083045973594572, 140.81752564444358),
				new WheelVector(13.490737563232042, -50.20871910285511),
				new WheelVector(11.524889824365358, 41.48242224694092));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 0.75, 1.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test745() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 0);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.029386365926403, -130.2363583092738),
				new WheelVector(15.556349186104045, 135.0),
				new WheelVector(18.384776310850235, -45.0),
				new WheelVector(17.029386365926403, 40.23635830927382));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 1.0, 0)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test746() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 60);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.761687112055832, -132.4287120211297),
				new WheelVector(16.30950643030009, 130.69338090449855),
				new WheelVector(17.72004514666935, -41.03676503255021),
				new WheelVector(18.20904224229416, 42.77448901203475));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 1.0, 60)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test747() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 120);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(15.761687112055833, -137.5712879788703),
				new WheelVector(17.72004514666935, 131.03676503255022),
				new WheelVector(16.309506430300093, -40.69338090449856),
				new WheelVector(18.209042242294156, 47.22551098796526));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 1.0, 120)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test748() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 180);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(17.029386365926403, -139.7636416907262),
				new WheelVector(18.384776310850235, 135.0),
				new WheelVector(15.556349186104045, -45.0),
				new WheelVector(17.029386365926403, 49.76364169072618));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 1.0, 180)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test749() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 240);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.209042242294156, -137.22551098796527),
				new WheelVector(17.720045146669353, 138.9632349674498),
				new WheelVector(16.30950643030009, -49.306619095501446),
				new WheelVector(15.761687112055833, 47.57128797887031));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 1.0, 240)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

	@Test
	void test750() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 300);
		WheelVector.VectorSet expected = new WheelVector.VectorSet(
				new WheelVector(18.20904224229416, -132.77448901203476),
				new WheelVector(16.30950643030009, 139.30661909550145),
				new WheelVector(17.72004514666935, -48.963234967449786),
				new WheelVector(15.761687112055832, 42.4287120211297));
		boolean equal = set.equals(expected);
		if (!equal) {
			fail("VectorSets do not match (processing: 1.0, 1.0, 1.0, 300)\n\t  got:       " + set.toString() + "\n\t  expected:  " + expected.toString());
		}
	}

}
