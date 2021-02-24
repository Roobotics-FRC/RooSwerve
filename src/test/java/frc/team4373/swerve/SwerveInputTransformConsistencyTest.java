package frc.team4373.swerve;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SwerveInputTransformConsistencyTest {
	SwerveInputTransform transform = new SwerveInputTransform(24, 24);

	@Test
	void test001() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0))));
	}

	@Test
	void test002() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0))));
	}

	@Test
	void test003() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, -0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, -0.0))));
	}

	@Test
	void test004() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, -0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, -0.0))));
	}

	@Test
	void test005() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.0, 180.0),
                                new WheelVector(0.0, 180.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0))));
	}

	@Test
	void test006() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0),
                                new WheelVector(0.0, 0.0))));
	}

	@Test
	void test007() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 135.0),
                                new WheelVector(0.25, -135.0),
                                new WheelVector(0.25, 45.0),
                                new WheelVector(0.25, -45.0))));
	}

	@Test
	void test008() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 135.0),
                                new WheelVector(0.25, -135.0),
                                new WheelVector(0.25, 45.0),
                                new WheelVector(0.25, -45.0))));
	}

	@Test
	void test009() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 135.0),
                                new WheelVector(0.25, -135.0),
                                new WheelVector(0.25, 45.0),
                                new WheelVector(0.25, -45.0))));
	}

	@Test
	void test010() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 135.0),
                                new WheelVector(0.25, -135.0),
                                new WheelVector(0.25, 45.0),
                                new WheelVector(0.25, -45.0))));
	}

	@Test
	void test011() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 135.0),
                                new WheelVector(0.25, -135.0),
                                new WheelVector(0.25, 45.0),
                                new WheelVector(0.25, -45.0))));
	}

	@Test
	void test012() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 135.0),
                                new WheelVector(0.25, -135.0),
                                new WheelVector(0.25, 45.0),
                                new WheelVector(0.25, -45.0))));
	}

	@Test
	void test013() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 135.0),
                                new WheelVector(0.5, -135.0),
                                new WheelVector(0.5, 45.0),
                                new WheelVector(0.5, -45.0))));
	}

	@Test
	void test014() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 135.0),
                                new WheelVector(0.5, -135.0),
                                new WheelVector(0.5, 45.0),
                                new WheelVector(0.5, -45.0))));
	}

	@Test
	void test015() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 135.0),
                                new WheelVector(0.5, -135.0),
                                new WheelVector(0.5, 45.0),
                                new WheelVector(0.5, -45.0))));
	}

	@Test
	void test016() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 135.0),
                                new WheelVector(0.5, -135.0),
                                new WheelVector(0.5, 45.0),
                                new WheelVector(0.5, -45.0))));
	}

	@Test
	void test017() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 135.0),
                                new WheelVector(0.5, -135.0),
                                new WheelVector(0.5, 45.0),
                                new WheelVector(0.5, -45.0))));
	}

	@Test
	void test018() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 135.0),
                                new WheelVector(0.5, -135.0),
                                new WheelVector(0.5, 45.0),
                                new WheelVector(0.5, -45.0))));
	}

	@Test
	void test019() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 135.0),
                                new WheelVector(0.7500000000000001, -135.0),
                                new WheelVector(0.7500000000000001, 45.0),
                                new WheelVector(0.7500000000000001, -45.0))));
	}

	@Test
	void test020() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 135.0),
                                new WheelVector(0.7500000000000001, -135.0),
                                new WheelVector(0.7500000000000001, 45.0),
                                new WheelVector(0.7500000000000001, -45.0))));
	}

	@Test
	void test021() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 135.0),
                                new WheelVector(0.7500000000000001, -135.0),
                                new WheelVector(0.7500000000000001, 45.0),
                                new WheelVector(0.7500000000000001, -45.0))));
	}

	@Test
	void test022() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 135.0),
                                new WheelVector(0.7500000000000001, -135.0),
                                new WheelVector(0.7500000000000001, 45.0),
                                new WheelVector(0.7500000000000001, -45.0))));
	}

	@Test
	void test023() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 135.0),
                                new WheelVector(0.7500000000000001, -135.0),
                                new WheelVector(0.7500000000000001, 45.0),
                                new WheelVector(0.7500000000000001, -45.0))));
	}

	@Test
	void test024() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 135.0),
                                new WheelVector(0.7500000000000001, -135.0),
                                new WheelVector(0.7500000000000001, 45.0),
                                new WheelVector(0.7500000000000001, -45.0))));
	}

	@Test
	void test025() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, -45.0))));
	}

	@Test
	void test026() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, -45.0))));
	}

	@Test
	void test027() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, -45.0))));
	}

	@Test
	void test028() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, -45.0))));
	}

	@Test
	void test029() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, -45.0))));
	}

	@Test
	void test030() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, -45.0))));
	}

	@Test
	void test031() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 0.0),
                                new WheelVector(0.25, 0.0),
                                new WheelVector(0.25, 0.0),
                                new WheelVector(0.25, 0.0))));
	}

	@Test
	void test032() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, -59.99999999999999),
                                new WheelVector(0.25, -59.99999999999999),
                                new WheelVector(0.25, -59.99999999999999),
                                new WheelVector(0.25, -59.99999999999999))));
	}

	@Test
	void test033() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.24999999999999997, -120.00000000000001),
                                new WheelVector(0.24999999999999997, -120.00000000000001),
                                new WheelVector(0.24999999999999997, -120.00000000000001),
                                new WheelVector(0.24999999999999997, -120.00000000000001))));
	}

	@Test
	void test034() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, -180.0),
                                new WheelVector(0.25, -180.0),
                                new WheelVector(0.25, -180.0),
                                new WheelVector(0.25, -180.0))));
	}

	@Test
	void test035() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 120.00000000000004),
                                new WheelVector(0.25, 120.00000000000004),
                                new WheelVector(0.25, 120.00000000000004),
                                new WheelVector(0.25, 120.00000000000004))));
	}

	@Test
	void test036() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 59.99999999999999),
                                new WheelVector(0.25, 59.99999999999999),
                                new WheelVector(0.25, 59.99999999999999),
                                new WheelVector(0.25, 59.99999999999999))));
	}

	@Test
	void test037() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.19134171618254492, 67.50000000000001),
                                new WheelVector(0.19134171618254492, -67.50000000000001),
                                new WheelVector(0.46193976625564337, 22.500000000000004),
                                new WheelVector(0.46193976625564337, -22.500000000000004))));
	}

	@Test
	void test038() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.06526309611002577, -142.50000000000003),
                                new WheelVector(0.39667667014561764, -97.5),
                                new WheelVector(0.30438071450436033, -7.499999999999995),
                                new WheelVector(0.49572243068690525, -52.50000000000001))));
	}

	@Test
	void test039() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.30438071450436033, -172.5),
                                new WheelVector(0.49572243068690525, -127.50000000000001),
                                new WheelVector(0.06526309611002586, -37.49999999999997),
                                new WheelVector(0.39667667014561764, -82.5))));
	}

	@Test
	void test040() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.46193976625564337, 157.5),
                                new WheelVector(0.46193976625564337, -157.5),
                                new WheelVector(0.19134171618254486, 112.50000000000001),
                                new WheelVector(0.19134171618254492, -112.5))));
	}

	@Test
	void test041() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4957224306869052, 127.50000000000001),
                                new WheelVector(0.3043807145043604, 172.50000000000003),
                                new WheelVector(0.39667667014561747, 82.50000000000001),
                                new WheelVector(0.06526309611002566, 37.49999999999999))));
	}

	@Test
	void test042() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.39667667014561764, 97.5),
                                new WheelVector(0.06526309611002577, 142.50000000000003),
                                new WheelVector(0.49572243068690525, 52.50000000000001),
                                new WheelVector(0.30438071450436033, 7.499999999999995))));
	}

	@Test
	void test043() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3684064395519752, 106.32494993689525),
                                new WheelVector(0.3684064395519752, -106.32494993689525),
                                new WheelVector(0.6994831629829533, 30.361193404821723),
                                new WheelVector(0.6994831629829533, -30.361193404821723))));
	}

	@Test
	void test044() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.26649304573990845, 149.0519131142261),
                                new WheelVector(0.614169977510811, -111.84727287354741),
                                new WheelVector(0.49779035619864104, 15.98053408400345),
                                new WheelVector(0.7442993057717219, -49.98723472563248))));
	}

	@Test
	void test045() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4977903561986409, 164.01946591599656),
                                new WheelVector(0.7442993057717218, -130.01276527436752),
                                new WheelVector(0.2664930457399085, 30.94808688577391),
                                new WheelVector(0.614169977510811, -68.1527271264526))));
	}

	@Test
	void test046() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6994831629829533, 149.6388065951783),
                                new WheelVector(0.6994831629829534, -149.6388065951783),
                                new WheelVector(0.3684064395519751, 73.67505006310476),
                                new WheelVector(0.3684064395519752, -73.67505006310476))));
	}

	@Test
	void test047() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7442993057717218, 130.01276527436755),
                                new WheelVector(0.4977903561986411, -164.01946591599653),
                                new WheelVector(0.6141699775108109, 68.1527271264526),
                                new WheelVector(0.2664930457399084, -30.948086885773943))));
	}

	@Test
	void test048() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.614169977510811, 111.84727287354741),
                                new WheelVector(0.26649304573990845, -149.0519131142261),
                                new WheelVector(0.7442993057717219, 49.98723472563248),
                                new WheelVector(0.49779035619864104, -15.98053408400345))));
	}

	@Test
	void test049() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5998624484455122, 117.8607277622439),
                                new WheelVector(0.5998624484455122, -117.8607277622439),
                                new WheelVector(0.9434855817366556, 34.20091950815379),
                                new WheelVector(0.9434855817366556, -34.20091950815379))));
	}

	@Test
	void test050() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5126185864184009, 142.25144491522693),
                                new WheelVector(0.8497394553117121, -118.4899848255466),
                                new WheelVector(0.7265967644344109, 25.588775848366875),
                                new WheelVector(0.9935905519168349, -48.73386716216781))));
	}

	@Test
	void test051() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7265967644344109, 154.41122415163315),
                                new WheelVector(0.993590551916835, -131.2661328378322),
                                new WheelVector(0.5126185864184009, 37.74855508477309),
                                new WheelVector(0.8497394553117124, -61.51001517445342))));
	}

	@Test
	void test052() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9434855817366556, 145.79908049184624),
                                new WheelVector(0.9434855817366556, -145.79908049184624),
                                new WheelVector(0.5998624484455122, 62.13927223775613),
                                new WheelVector(0.5998624484455122, -62.13927223775613))));
	}

	@Test
	void test053() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.993590551916835, 131.2661328378322),
                                new WheelVector(0.7265967644344111, -154.41122415163312),
                                new WheelVector(0.8497394553117121, 61.51001517445342),
                                new WheelVector(0.5126185864184007, -37.74855508477311))));
	}

	@Test
	void test054() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8497394553117121, 118.4899848255466),
                                new WheelVector(0.5126185864184009, -142.25144491522693),
                                new WheelVector(0.9935905519168349, 48.73386716216781),
                                new WheelVector(0.7265967644344109, -25.588775848366875))));
	}

	@Test
	void test055() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7075659915250843, 122.88051081011038),
                                new WheelVector(0.7075659915250843, -122.88051081011038),
                                new WheelVector(1.0, 36.456845185107724),
                                new WheelVector(1.0, -36.456845185107724))));
	}

	@Test
	void test056() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.612366357058668, 139.87576260774736),
                                new WheelVector(0.878197812380431, -122.22116310969463),
                                new WheelVector(0.7770206931527176, 30.52310437332923),
                                new WheelVector(1.0, -47.98349874197314))));
	}

	@Test
	void test057() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7770206931527175, 149.47689562667077),
                                new WheelVector(1.0, -132.01650125802686),
                                new WheelVector(0.612366357058668, 40.12423739225263),
                                new WheelVector(0.878197812380431, -57.77883689030538))));
	}

	@Test
	void test058() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 143.5431548148923),
                                new WheelVector(1.0, -143.5431548148923),
                                new WheelVector(0.7075659915250843, 57.119489189889634),
                                new WheelVector(0.7075659915250843, -57.119489189889634))));
	}

	@Test
	void test059() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 132.01650125802686),
                                new WheelVector(0.7770206931527177, -149.47689562667077),
                                new WheelVector(0.8781978123804308, 57.77883689030539),
                                new WheelVector(0.612366357058668, -40.12423739225265))));
	}

	@Test
	void test060() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.878197812380431, 122.22116310969463),
                                new WheelVector(0.612366357058668, -139.87576260774736),
                                new WheelVector(1.0, 47.98349874197314),
                                new WheelVector(0.7770206931527176, -30.52310437332923))));
	}

	@Test
	void test061() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 0.0),
                                new WheelVector(0.5, 0.0),
                                new WheelVector(0.5, 0.0),
                                new WheelVector(0.5, 0.0))));
	}

	@Test
	void test062() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, -59.99999999999999),
                                new WheelVector(0.5, -59.99999999999999),
                                new WheelVector(0.5, -59.99999999999999),
                                new WheelVector(0.5, -59.99999999999999))));
	}

	@Test
	void test063() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.49999999999999994, -120.00000000000001),
                                new WheelVector(0.49999999999999994, -120.00000000000001),
                                new WheelVector(0.49999999999999994, -120.00000000000001),
                                new WheelVector(0.49999999999999994, -120.00000000000001))));
	}

	@Test
	void test064() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, -180.0),
                                new WheelVector(0.5, -180.0),
                                new WheelVector(0.5, -180.0),
                                new WheelVector(0.5, -180.0))));
	}

	@Test
	void test065() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 120.00000000000004),
                                new WheelVector(0.5, 120.00000000000004),
                                new WheelVector(0.5, 120.00000000000004),
                                new WheelVector(0.5, 120.00000000000004))));
	}

	@Test
	void test066() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 59.99999999999999),
                                new WheelVector(0.5, 59.99999999999999),
                                new WheelVector(0.5, 59.99999999999999),
                                new WheelVector(0.5, 59.99999999999999))));
	}

	@Test
	void test067() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.36840643955197516, 28.675050063104766),
                                new WheelVector(0.36840643955197516, -28.675050063104766),
                                new WheelVector(0.6994831629829533, 14.63880659517829),
                                new WheelVector(0.6994831629829533, -14.63880659517829))));
	}

	@Test
	void test068() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.26649304573990845, -74.05191311422608),
                                new WheelVector(0.614169977510811, -83.15272712645259),
                                new WheelVector(0.497790356198641, -30.98053408400344),
                                new WheelVector(0.7442993057717218, -55.01276527436752))));
	}

	@Test
	void test069() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4977903561986408, -149.01946591599656),
                                new WheelVector(0.7442993057717218, -124.98723472563248),
                                new WheelVector(0.2664930457399084, -105.94808688577389),
                                new WheelVector(0.6141699775108111, -96.8472728735474))));
	}

	@Test
	void test070() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6994831629829533, 165.3611934048217),
                                new WheelVector(0.6994831629829533, -165.3611934048217),
                                new WheelVector(0.36840643955197516, 151.32494993689522),
                                new WheelVector(0.3684064395519752, -151.32494993689522))));
	}

	@Test
	void test071() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7442993057717218, 124.9872347256325),
                                new WheelVector(0.49779035619864104, 149.0194659159966),
                                new WheelVector(0.6141699775108109, 96.84727287354742),
                                new WheelVector(0.2664930457399084, 105.94808688577398))));
	}

	@Test
	void test072() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.614169977510811, 83.15272712645259),
                                new WheelVector(0.26649304573990845, 74.05191311422608),
                                new WheelVector(0.7442993057717218, 55.01276527436752),
                                new WheelVector(0.497790356198641, 30.98053408400344))));
	}

	@Test
	void test073() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.38268343236508984, 67.50000000000001),
                                new WheelVector(0.38268343236508984, -67.50000000000001),
                                new WheelVector(0.9238795325112867, 22.500000000000004),
                                new WheelVector(0.9238795325112867, -22.500000000000004))));
	}

	@Test
	void test074() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.13052619222005155, -142.50000000000003),
                                new WheelVector(0.7933533402912353, -97.5),
                                new WheelVector(0.6087614290087207, -7.499999999999995),
                                new WheelVector(0.9914448613738105, -52.50000000000001))));
	}

	@Test
	void test075() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6087614290087207, -172.5),
                                new WheelVector(0.9914448613738105, -127.50000000000001),
                                new WheelVector(0.1305261922200517, -37.49999999999997),
                                new WheelVector(0.7933533402912353, -82.5))));
	}

	@Test
	void test076() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9238795325112867, 157.5),
                                new WheelVector(0.9238795325112867, -157.5),
                                new WheelVector(0.3826834323650897, 112.50000000000001),
                                new WheelVector(0.38268343236508984, -112.5))));
	}

	@Test
	void test077() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9914448613738104, 127.50000000000001),
                                new WheelVector(0.6087614290087208, 172.50000000000003),
                                new WheelVector(0.7933533402912349, 82.50000000000001),
                                new WheelVector(0.13052619222005132, 37.49999999999999))));
	}

	@Test
	void test078() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7933533402912353, 97.5),
                                new WheelVector(0.13052619222005155, 142.50000000000003),
                                new WheelVector(0.9914448613738105, 52.50000000000001),
                                new WheelVector(0.6087614290087207, 7.499999999999995))));
	}

	@Test
	void test079() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4584002243324191, 93.27323494581232),
                                new WheelVector(0.4584002243324191, -93.27323494581232),
                                new WheelVector(1.0, 27.23572392039049),
                                new WheelVector(1.0, -27.23572392039049))));
	}

	@Test
	void test080() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.23935885067189017, 160.85541048242075),
                                new WheelVector(0.809286824929511, -106.22484972764532),
                                new WheelVector(0.6343086743774511, 7.108830510743483),
                                new WheelVector(1.0, -50.99172200139381))));
	}

	@Test
	void test081() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.634308674377451, 172.89116948925653),
                                new WheelVector(1.0, -129.0082779986062),
                                new WheelVector(0.23935885067189025, 19.14458951757924),
                                new WheelVector(0.809286824929511, -73.7751502723547))));
	}

	@Test
	void test082() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9999999999999998, 152.76427607960952),
                                new WheelVector(1.0, -152.76427607960952),
                                new WheelVector(0.45840022433241895, 86.7267650541877),
                                new WheelVector(0.4584002243324191, -86.7267650541877))));
	}

	@Test
	void test083() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 129.00827799860622),
                                new WheelVector(0.6343086743774513, -172.8911694892565),
                                new WheelVector(0.8092868249295109, 73.7751502723547),
                                new WheelVector(0.23935885067189008, -19.14458951757929))));
	}

	@Test
	void test084() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.809286824929511, 106.22484972764532),
                                new WheelVector(0.23935885067189017, -160.85541048242075),
                                new WheelVector(1.0, 50.99172200139381),
                                new WheelVector(0.6343086743774511, -7.108830510743483))));
	}

	@Test
	void test085() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5266837846116297, 106.32494993689525),
                                new WheelVector(0.5266837846116297, -106.32494993689525),
                                new WheelVector(1.0, 30.361193404821723),
                                new WheelVector(1.0, -30.361193404821723))));
	}

	@Test
	void test086() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.35804553849959175, 149.0519131142261),
                                new WheelVector(0.8251653236113299, -111.84727287354741),
                                new WheelVector(0.6688040044354339, 15.98053408400345),
                                new WheelVector(1.0, -49.98723472563248))));
	}

	@Test
	void test087() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6688040044354339, 164.01946591599656),
                                new WheelVector(1.0, -130.01276527436752),
                                new WheelVector(0.35804553849959186, 30.94808688577391),
                                new WheelVector(0.82516532361133, -68.1527271264526))));
	}

	@Test
	void test088() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9999999999999999, 149.6388065951783),
                                new WheelVector(1.0, -149.6388065951783),
                                new WheelVector(0.5266837846116293, 73.67505006310476),
                                new WheelVector(0.5266837846116296, -73.67505006310476))));
	}

	@Test
	void test089() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 130.01276527436755),
                                new WheelVector(0.6688040044354341, -164.01946591599653),
                                new WheelVector(0.8251653236113299, 68.1527271264526),
                                new WheelVector(0.3580455384995917, -30.948086885773943))));
	}

	@Test
	void test090() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8251653236113299, 111.84727287354741),
                                new WheelVector(0.35804553849959175, -149.0519131142261),
                                new WheelVector(1.0, 49.98723472563248),
                                new WheelVector(0.6688040044354339, -15.98053408400345))));
	}

	@Test
	void test091() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.75, 0.0),
                                new WheelVector(0.75, 0.0),
                                new WheelVector(0.75, 0.0),
                                new WheelVector(0.75, 0.0))));
	}

	@Test
	void test092() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, -59.99999999999999),
                                new WheelVector(0.7500000000000001, -59.99999999999999),
                                new WheelVector(0.7500000000000001, -59.99999999999999),
                                new WheelVector(0.7500000000000001, -59.99999999999999))));
	}

	@Test
	void test093() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7499999999999999, -120.00000000000001),
                                new WheelVector(0.7499999999999999, -120.00000000000001),
                                new WheelVector(0.7499999999999999, -120.00000000000001),
                                new WheelVector(0.7499999999999999, -120.00000000000001))));
	}

	@Test
	void test094() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.75, -180.0),
                                new WheelVector(0.75, -180.0),
                                new WheelVector(0.75, -180.0),
                                new WheelVector(0.75, -180.0))));
	}

	@Test
	void test095() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.75, 120.00000000000004),
                                new WheelVector(0.75, 120.00000000000004),
                                new WheelVector(0.75, 120.00000000000004),
                                new WheelVector(0.75, 120.00000000000004))));
	}

	@Test
	void test096() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 59.99999999999999),
                                new WheelVector(0.7500000000000001, 59.99999999999999),
                                new WheelVector(0.7500000000000001, 59.99999999999999),
                                new WheelVector(0.7500000000000001, 59.99999999999999))));
	}

	@Test
	void test097() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5998624484455122, 17.139272237756135),
                                new WheelVector(0.5998624484455122, -17.139272237756135),
                                new WheelVector(0.9434855817366555, 10.79908049184622),
                                new WheelVector(0.9434855817366555, -10.79908049184622))));
	}

	@Test
	void test098() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5126185864184009, -67.2514449152269),
                                new WheelVector(0.8497394553117121, -76.51001517445341),
                                new WheelVector(0.7265967644344109, -40.58877584836687),
                                new WheelVector(0.9935905519168349, -56.26613283783218))));
	}

	@Test
	void test099() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7265967644344108, -139.41122415163312),
                                new WheelVector(0.9935905519168348, -123.73386716216781),
                                new WheelVector(0.5126185864184007, -112.74855508477309),
                                new WheelVector(0.8497394553117121, -103.48998482554657))));
	}

	@Test
	void test100() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9434855817366555, 169.2009195081538),
                                new WheelVector(0.9434855817366555, -169.20091950815376),
                                new WheelVector(0.5998624484455122, 162.8607277622439),
                                new WheelVector(0.5998624484455122, -162.86072776224387))));
	}

	@Test
	void test101() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9935905519168349, 123.73386716216784),
                                new WheelVector(0.7265967644344109, 139.41122415163315),
                                new WheelVector(0.849739455311712, 103.4899848255466),
                                new WheelVector(0.5126185864184007, 112.74855508477314))));
	}

	@Test
	void test102() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8497394553117121, 76.51001517445341),
                                new WheelVector(0.5126185864184009, 67.2514449152269),
                                new WheelVector(0.9935905519168349, 56.26613283783218),
                                new WheelVector(0.7265967644344109, 40.58877584836687))));
	}

	@Test
	void test103() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4584002243324191, 41.726765054187695),
                                new WheelVector(0.4584002243324191, -41.726765054187695),
                                new WheelVector(1.0, 17.764276079609512),
                                new WheelVector(1.0, -17.764276079609512))));
	}

	@Test
	void test104() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.23935885067189017, -85.85541048242074),
                                new WheelVector(0.8092868249295109, -88.7751502723547),
                                new WheelVector(0.6343086743774512, -22.10883051074347),
                                new WheelVector(1.0, -54.00827799860619))));
	}

	@Test
	void test105() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6343086743774511, -157.89116948925653),
                                new WheelVector(1.0, -125.99172200139381),
                                new WheelVector(0.23935885067189017, -94.14458951757922),
                                new WheelVector(0.809286824929511, -91.2248497276453))));
	}

	@Test
	void test106() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 162.2357239203905),
                                new WheelVector(1.0, -162.23572392039048),
                                new WheelVector(0.458400224332419, 138.27323494581233),
                                new WheelVector(0.4584002243324191, -138.2732349458123))));
	}

	@Test
	void test107() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 125.99172200139384),
                                new WheelVector(0.6343086743774513, 157.89116948925655),
                                new WheelVector(0.8092868249295107, 91.22484972764533),
                                new WheelVector(0.23935885067188994, 94.14458951757932))));
	}

	@Test
	void test108() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8092868249295109, 88.7751502723547),
                                new WheelVector(0.23935885067189017, 85.85541048242074),
                                new WheelVector(1.0, 54.00827799860619),
                                new WheelVector(0.6343086743774512, 22.10883051074347))));
	}

	@Test
	void test109() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.41421356237309503, 67.50000000000001),
                                new WheelVector(0.41421356237309503, -67.50000000000001),
                                new WheelVector(1.0, 22.500000000000004),
                                new WheelVector(1.0, -22.500000000000004))));
	}

	@Test
	void test110() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.1316524975873958, -142.50000000000003),
                                new WheelVector(0.8001991549907407, -97.5),
                                new WheelVector(0.6140144073823545, -7.4999999999999964),
                                new WheelVector(1.0, -52.5))));
	}

	@Test
	void test111() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6140144073823541, -172.5),
                                new WheelVector(1.0, -127.50000000000001),
                                new WheelVector(0.13165249758739594, -37.49999999999995),
                                new WheelVector(0.8001991549907407, -82.5))));
	}

	@Test
	void test112() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 157.5),
                                new WheelVector(1.0, -157.5),
                                new WheelVector(0.4142135623730949, 112.50000000000001),
                                new WheelVector(0.4142135623730951, -112.5))));
	}

	@Test
	void test113() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 127.50000000000001),
                                new WheelVector(0.6140144073823545, 172.50000000000003),
                                new WheelVector(0.8001991549907406, 82.50000000000001),
                                new WheelVector(0.13165249758739558, 37.499999999999986))));
	}

	@Test
	void test114() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8001991549907407, 97.5),
                                new WheelVector(0.1316524975873958, 142.50000000000003),
                                new WheelVector(1.0, 52.5),
                                new WheelVector(0.6140144073823545, 7.4999999999999964))));
	}

	@Test
	void test115() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4373913178314939, 86.52868175547141),
                                new WheelVector(0.4373913178314939, -86.52868175547141),
                                new WheelVector(1.0, 25.886435298262683),
                                new WheelVector(1.0, -25.886435298262683))));
	}

	@Test
	void test116() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.19423490531978055, 170.16265868624802),
                                new WheelVector(0.8048501160215458, -103.7556802620704),
                                new WheelVector(0.6244545533381018, 3.0463020624843655),
                                new WheelVector(1.0, -51.42253667541703))));
	}

	@Test
	void test117() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6244545533381017, 176.95369793751564),
                                new WheelVector(1.0, -128.57746332458296),
                                new WheelVector(0.19423490531978072, 9.837341313751956),
                                new WheelVector(0.8048501160215459, -76.2443197379296))));
	}

	@Test
	void test118() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 154.11356470173735),
                                new WheelVector(1.0, -154.11356470173732),
                                new WheelVector(0.4373913178314938, 93.47131824452859),
                                new WheelVector(0.43739131783149393, -93.47131824452859))));
	}

	@Test
	void test119() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 128.577463324583),
                                new WheelVector(0.624454553338102, -176.95369793751564),
                                new WheelVector(0.8048501160215458, 76.2443197379296),
                                new WheelVector(0.19423490531978044, -9.837341313752008))));
	}

	@Test
	void test120() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8048501160215458, 103.7556802620704),
                                new WheelVector(0.19423490531978055, -170.16265868624802),
                                new WheelVector(1.0, 51.42253667541703),
                                new WheelVector(0.6244545533381018, -3.0463020624843655))));
	}

	@Test
	void test121() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 0.0),
                                new WheelVector(1.0, 0.0),
                                new WheelVector(1.0, 0.0),
                                new WheelVector(1.0, 0.0))));
	}

	@Test
	void test122() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -59.99999999999999),
                                new WheelVector(1.0, -59.99999999999999),
                                new WheelVector(1.0, -59.99999999999999),
                                new WheelVector(1.0, -59.99999999999999))));
	}

	@Test
	void test123() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9999999999999999, -120.00000000000001),
                                new WheelVector(0.9999999999999999, -120.00000000000001),
                                new WheelVector(0.9999999999999999, -120.00000000000001),
                                new WheelVector(0.9999999999999999, -120.00000000000001))));
	}

	@Test
	void test124() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -180.0),
                                new WheelVector(1.0, -180.0),
                                new WheelVector(1.0, -180.0),
                                new WheelVector(1.0, -180.0))));
	}

	@Test
	void test125() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 120.00000000000004),
                                new WheelVector(1.0, 120.00000000000004),
                                new WheelVector(1.0, 120.00000000000004),
                                new WheelVector(1.0, 120.00000000000004))));
	}

	@Test
	void test126() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 59.99999999999999),
                                new WheelVector(1.0, 59.99999999999999),
                                new WheelVector(1.0, 59.99999999999999),
                                new WheelVector(1.0, 59.99999999999999))));
	}

	@Test
	void test127() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7075659915250843, 12.11948918988963),
                                new WheelVector(0.7075659915250843, -12.11948918988963),
                                new WheelVector(1.0, 8.54315481489228),
                                new WheelVector(1.0, -8.54315481489228))));
	}

	@Test
	void test128() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.612366357058668, -64.87576260774736),
                                new WheelVector(0.878197812380431, -72.77883689030537),
                                new WheelVector(0.7770206931527176, -45.523104373329225),
                                new WheelVector(1.0, -57.01650125802686))));
	}

	@Test
	void test129() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7770206931527175, -134.47689562667077),
                                new WheelVector(1.0, -122.98349874197312),
                                new WheelVector(0.612366357058668, -115.12423739225262),
                                new WheelVector(0.8781978123804308, -107.22116310969461))));
	}

	@Test
	void test130() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 171.45684518510774),
                                new WheelVector(1.0, -171.4568451851077),
                                new WheelVector(0.7075659915250843, 167.88051081011037),
                                new WheelVector(0.7075659915250843, -167.88051081011037))));
	}

	@Test
	void test131() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 122.98349874197315),
                                new WheelVector(0.7770206931527176, 134.47689562667082),
                                new WheelVector(0.8781978123804308, 107.22116310969466),
                                new WheelVector(0.612366357058668, 115.12423739225267))));
	}

	@Test
	void test132() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.878197812380431, 72.77883689030537),
                                new WheelVector(0.612366357058668, 64.87576260774736),
                                new WheelVector(1.0, 57.01650125802686),
                                new WheelVector(0.7770206931527176, 45.523104373329225))));
	}

	@Test
	void test133() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5266837846116296, 28.675050063104766),
                                new WheelVector(0.5266837846116296, -28.675050063104766),
                                new WheelVector(1.0, 14.63880659517829),
                                new WheelVector(1.0, -14.63880659517829))));
	}

	@Test
	void test134() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3580455384995918, -74.05191311422608),
                                new WheelVector(0.82516532361133, -83.15272712645259),
                                new WheelVector(0.6688040044354339, -30.98053408400344),
                                new WheelVector(1.0, -55.01276527436752))));
	}

	@Test
	void test135() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6688040044354336, -149.01946591599656),
                                new WheelVector(1.0, -124.98723472563248),
                                new WheelVector(0.3580455384995917, -105.94808688577389),
                                new WheelVector(0.8251653236113301, -96.8472728735474))));
	}

	@Test
	void test136() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 165.3611934048217),
                                new WheelVector(1.0, -165.3611934048217),
                                new WheelVector(0.5266837846116296, 151.32494993689522),
                                new WheelVector(0.5266837846116297, -151.32494993689522))));
	}

	@Test
	void test137() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 124.9872347256325),
                                new WheelVector(0.668804004435434, 149.0194659159966),
                                new WheelVector(0.8251653236113299, 96.84727287354742),
                                new WheelVector(0.3580455384995917, 105.94808688577398))));
	}

	@Test
	void test138() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.82516532361133, 83.15272712645259),
                                new WheelVector(0.3580455384995918, 74.05191311422608),
                                new WheelVector(1.0, 55.01276527436752),
                                new WheelVector(0.6688040044354339, 30.98053408400344))));
	}

	@Test
	void test139() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.43739131783149376, 48.471318244528604),
                                new WheelVector(0.43739131783149376, -48.471318244528604),
                                new WheelVector(1.0, 19.113564701737324),
                                new WheelVector(1.0, -19.113564701737324))));
	}

	@Test
	void test140() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.19423490531978052, -95.16265868624804),
                                new WheelVector(0.8048501160215458, -91.2443197379296),
                                new WheelVector(0.624454553338102, -18.046302062484354),
                                new WheelVector(1.0, -53.577463324582965))));
	}

	@Test
	void test141() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6244545533381017, -161.95369793751564),
                                new WheelVector(1.0, -126.42253667541702),
                                new WheelVector(0.19423490531978063, -84.8373413137519),
                                new WheelVector(0.8048501160215459, -88.7556802620704))));
	}

	@Test
	void test142() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 160.88643529826268),
                                new WheelVector(1.0, -160.88643529826265),
                                new WheelVector(0.43739131783149376, 131.5286817554714),
                                new WheelVector(0.4373913178314938, -131.52868175547138))));
	}

	@Test
	void test143() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 126.42253667541705),
                                new WheelVector(0.624454553338102, 161.95369793751564),
                                new WheelVector(0.8048501160215457, 88.75568026207043),
                                new WheelVector(0.19423490531978038, 84.83734131375202))));
	}

	@Test
	void test144() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8048501160215458, 91.2443197379296),
                                new WheelVector(0.19423490531978052, 95.16265868624804),
                                new WheelVector(1.0, 53.577463324582965),
                                new WheelVector(0.624454553338102, 18.046302062484354))));
	}

	@Test
	void test145() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.41421356237309515, 67.50000000000001),
                                new WheelVector(0.41421356237309515, -67.50000000000001),
                                new WheelVector(1.0, 22.500000000000004),
                                new WheelVector(1.0, -22.500000000000004))));
	}

	@Test
	void test146() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.1316524975873958, -142.50000000000003),
                                new WheelVector(0.8001991549907408, -97.5),
                                new WheelVector(0.6140144073823542, -7.499999999999995),
                                new WheelVector(1.0, -52.50000000000001))));
	}

	@Test
	void test147() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6140144073823542, -172.5),
                                new WheelVector(1.0, -127.50000000000001),
                                new WheelVector(0.13165249758739597, -37.49999999999997),
                                new WheelVector(0.8001991549907408, -82.5))));
	}

	@Test
	void test148() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 157.5),
                                new WheelVector(1.0, -157.5),
                                new WheelVector(0.41421356237309503, 112.50000000000001),
                                new WheelVector(0.41421356237309515, -112.5))));
	}

	@Test
	void test149() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 127.50000000000001),
                                new WheelVector(0.6140144073823545, 172.50000000000003),
                                new WheelVector(0.8001991549907406, 82.50000000000001),
                                new WheelVector(0.13165249758739558, 37.49999999999999))));
	}

	@Test
	void test150() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8001991549907408, 97.5),
                                new WheelVector(0.1316524975873958, 142.50000000000003),
                                new WheelVector(1.0, 52.50000000000001),
                                new WheelVector(0.6140144073823542, 7.499999999999995))));
	}

	@Test
	void test151() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 90.0),
                                new WheelVector(0.25, 90.0),
                                new WheelVector(0.25, 90.0),
                                new WheelVector(0.25, 90.0))));
	}

	@Test
	void test152() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 30.00000000000001),
                                new WheelVector(0.25, 30.00000000000001),
                                new WheelVector(0.25, 30.00000000000001),
                                new WheelVector(0.25, 30.00000000000001))));
	}

	@Test
	void test153() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.24999999999999997, -29.999999999999993),
                                new WheelVector(0.24999999999999997, -29.999999999999993),
                                new WheelVector(0.24999999999999997, -29.999999999999993),
                                new WheelVector(0.24999999999999997, -29.999999999999993))));
	}

	@Test
	void test154() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, -90.0),
                                new WheelVector(0.25, -90.0),
                                new WheelVector(0.25, -90.0),
                                new WheelVector(0.25, -90.0))));
	}

	@Test
	void test155() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, -149.99999999999997),
                                new WheelVector(0.25, -149.99999999999997),
                                new WheelVector(0.25, -149.99999999999997),
                                new WheelVector(0.25, -149.99999999999997))));
	}

	@Test
	void test156() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.25, 149.99999999999997),
                                new WheelVector(0.25, 149.99999999999997),
                                new WheelVector(0.25, 149.99999999999997),
                                new WheelVector(0.25, 149.99999999999997))));
	}

	@Test
	void test157() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.46193976625564337, 112.50000000000001),
                                new WheelVector(0.19134171618254492, 157.5),
                                new WheelVector(0.46193976625564337, 67.5),
                                new WheelVector(0.19134171618254492, 22.499999999999996))));
	}

	@Test
	void test158() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.30438071450436033, 82.50000000000001),
                                new WheelVector(0.06526309611002577, -52.50000000000001),
                                new WheelVector(0.49572243068690525, 37.5),
                                new WheelVector(0.39667667014561764, -7.499999999999998))));
	}

	@Test
	void test159() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.06526309611002586, 52.500000000000036),
                                new WheelVector(0.30438071450436033, -82.50000000000001),
                                new WheelVector(0.39667667014561764, 7.500000000000011),
                                new WheelVector(0.49572243068690525, -37.49999999999999))));
	}

	@Test
	void test160() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.19134171618254486, -157.5),
                                new WheelVector(0.46193976625564337, -112.50000000000001),
                                new WheelVector(0.19134171618254492, -22.499999999999993),
                                new WheelVector(0.46193976625564337, -67.5))));
	}

	@Test
	void test161() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.39667667014561747, 172.5),
                                new WheelVector(0.4957224306869052, -142.5),
                                new WheelVector(0.06526309611002566, 127.50000000000001),
                                new WheelVector(0.3043807145043604, -97.49999999999999))));
	}

	@Test
	void test162() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.49572243068690525, 142.5),
                                new WheelVector(0.39667667014561764, -172.5),
                                new WheelVector(0.30438071450436033, 97.5),
                                new WheelVector(0.06526309611002577, -127.50000000000001))));
	}

	@Test
	void test163() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6994831629829533, 120.36119340482172),
                                new WheelVector(0.3684064395519752, -163.67505006310478),
                                new WheelVector(0.6994831629829533, 59.63880659517828),
                                new WheelVector(0.3684064395519752, -16.32494993689524))));
	}

	@Test
	void test164() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.49779035619864104, 105.98053408400347),
                                new WheelVector(0.26649304573990845, -120.94808688577392),
                                new WheelVector(0.7442993057717219, 40.012765274367524),
                                new WheelVector(0.614169977510811, -21.8472728735474))));
	}

	@Test
	void test165() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.2664930457399085, 120.94808688577392),
                                new WheelVector(0.4977903561986409, -105.98053408400347),
                                new WheelVector(0.614169977510811, 21.847272873547407),
                                new WheelVector(0.7442993057717218, -40.01276527436752))));
	}

	@Test
	void test166() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3684064395519751, 163.67505006310478),
                                new WheelVector(0.6994831629829533, -120.36119340482172),
                                new WheelVector(0.3684064395519752, 16.324949936895237),
                                new WheelVector(0.6994831629829534, -59.63880659517828))));
	}

	@Test
	void test167() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6141699775108109, 158.1527271264526),
                                new WheelVector(0.7442993057717218, -139.98723472563248),
                                new WheelVector(0.2664930457399084, 59.05191311422606),
                                new WheelVector(0.4977903561986411, -74.01946591599653))));
	}

	@Test
	void test168() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7442993057717219, 139.98723472563248),
                                new WheelVector(0.614169977510811, -158.1527271264526),
                                new WheelVector(0.49779035619864104, 74.01946591599655),
                                new WheelVector(0.26649304573990845, -59.05191311422608))));
	}

	@Test
	void test169() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9434855817366556, 124.20091950815379),
                                new WheelVector(0.5998624484455122, -152.13927223775613),
                                new WheelVector(0.9434855817366556, 55.79908049184622),
                                new WheelVector(0.5998624484455122, -27.860727762243872))));
	}

	@Test
	void test170() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7265967644344109, 115.58877584836688),
                                new WheelVector(0.5126185864184009, -127.7485550847731),
                                new WheelVector(0.9935905519168349, 41.26613283783219),
                                new WheelVector(0.8497394553117121, -28.489984825546582))));
	}

	@Test
	void test171() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5126185864184009, 127.74855508477309),
                                new WheelVector(0.7265967644344109, -115.58877584836688),
                                new WheelVector(0.8497394553117124, 28.489984825546582),
                                new WheelVector(0.993590551916835, -41.26613283783218))));
	}

	@Test
	void test172() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5998624484455122, 152.13927223775613),
                                new WheelVector(0.9434855817366556, -124.20091950815379),
                                new WheelVector(0.5998624484455122, 27.860727762243872),
                                new WheelVector(0.9434855817366556, -55.79908049184622))));
	}

	@Test
	void test173() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8497394553117121, 151.51001517445346),
                                new WheelVector(0.993590551916835, -138.7338671621678),
                                new WheelVector(0.5126185864184007, 52.25144491522689),
                                new WheelVector(0.7265967644344111, -64.41122415163314))));
	}

	@Test
	void test174() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9935905519168349, 138.73386716216783),
                                new WheelVector(0.8497394553117121, -151.51001517445343),
                                new WheelVector(0.7265967644344109, 64.41122415163314),
                                new WheelVector(0.5126185864184009, -52.251444915226905))));
	}

	@Test
	void test175() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 126.45684518510771),
                                new WheelVector(0.7075659915250843, -147.11948918988963),
                                new WheelVector(1.0, 53.54315481489228),
                                new WheelVector(0.7075659915250843, -32.88051081011037))));
	}

	@Test
	void test176() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7770206931527176, 120.52310437332923),
                                new WheelVector(0.612366357058668, -130.12423739225264),
                                new WheelVector(1.0, 42.016501258026864),
                                new WheelVector(0.878197812380431, -32.22116310969462))));
	}

	@Test
	void test177() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.612366357058668, 130.12423739225264),
                                new WheelVector(0.7770206931527175, -120.52310437332923),
                                new WheelVector(0.878197812380431, 32.22116310969463),
                                new WheelVector(1.0, -42.01650125802686))));
	}

	@Test
	void test178() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7075659915250843, 147.11948918988963),
                                new WheelVector(1.0, -126.45684518510771),
                                new WheelVector(0.7075659915250843, 32.88051081011037),
                                new WheelVector(1.0, -53.54315481489228))));
	}

	@Test
	void test179() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8781978123804308, 147.7788368903054),
                                new WheelVector(1.0, -137.98349874197314),
                                new WheelVector(0.612366357058668, 49.875762607747355),
                                new WheelVector(0.7770206931527177, -59.476895626670775))));
	}

	@Test
	void test180() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 137.98349874197314),
                                new WheelVector(0.878197812380431, -147.7788368903054),
                                new WheelVector(0.7770206931527176, 59.476895626670775),
                                new WheelVector(0.612366357058668, -49.87576260774736))));
	}

	@Test
	void test181() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3535533905932738, 45.0),
                                new WheelVector(0.3535533905932738, 45.0),
                                new WheelVector(0.3535533905932738, 45.0),
                                new WheelVector(0.3535533905932738, 45.0))));
	}

	@Test
	void test182() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3535533905932738, -14.999999999999993),
                                new WheelVector(0.3535533905932738, -14.999999999999993),
                                new WheelVector(0.3535533905932738, -14.999999999999993),
                                new WheelVector(0.3535533905932738, -14.999999999999993))));
	}

	@Test
	void test183() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.35355339059327373, -74.99999999999999),
                                new WheelVector(0.35355339059327373, -74.99999999999999),
                                new WheelVector(0.35355339059327373, -74.99999999999999),
                                new WheelVector(0.35355339059327373, -74.99999999999999))));
	}

	@Test
	void test184() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3535533905932738, -135.0),
                                new WheelVector(0.3535533905932738, -135.0),
                                new WheelVector(0.3535533905932738, -135.0),
                                new WheelVector(0.3535533905932738, -135.0))));
	}

	@Test
	void test185() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.35355339059327373, 165.00000000000003),
                                new WheelVector(0.35355339059327373, 165.00000000000003),
                                new WheelVector(0.35355339059327373, 165.00000000000003),
                                new WheelVector(0.35355339059327373, 165.00000000000003))));
	}

	@Test
	void test186() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3535533905932738, 105.0),
                                new WheelVector(0.3535533905932738, 105.0),
                                new WheelVector(0.3535533905932738, 105.0),
                                new WheelVector(0.3535533905932738, 105.0))));
	}

	@Test
	void test187() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4330127018922193, 80.26438968275465),
                                new WheelVector(0.10355339059327374, 45.0),
                                new WheelVector(0.6035533905932737, 45.0),
                                new WheelVector(0.4330127018922193, 9.735610317245344))));
	}

	@Test
	void test188() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.1854909460756815, 27.36780515862268),
                                new WheelVector(0.3148200316874413, -58.4494755261363),
                                new WheelVector(0.5252507474038647, 9.342870175267215),
                                new WheelVector(0.5836035545847443, -27.367805158622673))));
	}

	@Test
	void test189() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.18549094607568137, -117.36780515862269),
                                new WheelVector(0.5252507474038646, -99.34287017526722),
                                new WheelVector(0.3148200316874413, -31.550524473863675),
                                new WheelVector(0.5836035545847442, -62.63219484137731))));
	}

	@Test
	void test190() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4330127018922193, -170.26438968275465),
                                new WheelVector(0.6035533905932738, -135.0),
                                new WheelVector(0.10355339059327376, -134.99999999999997),
                                new WheelVector(0.4330127018922194, -99.73561031724536))));
	}

	@Test
	void test191() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5836035545847442, 152.63219484137733),
                                new WheelVector(0.5252507474038647, -170.65712982473278),
                                new WheelVector(0.31482003168744116, 121.55052447386373),
                                new WheelVector(0.18549094607568156, -152.6321948413773))));
	}

	@Test
	void test192() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5836035545847443, 117.36780515862269),
                                new WheelVector(0.3148200316874413, 148.4494755261363),
                                new WheelVector(0.5252507474038647, 80.65712982473278),
                                new WheelVector(0.1854909460756815, 62.63219484137731))));
	}

	@Test
	void test193() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6123724356957945, 99.73561031724536),
                                new WheelVector(0.14644660940672627, -135.0),
                                new WheelVector(0.8535533905932737, 45.0),
                                new WheelVector(0.6123724356957945, -9.73561031724535))));
	}

	@Test
	void test194() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.26232381163764523, 92.63219484137733),
                                new WheelVector(0.4452227585191071, -91.5505244738637),
                                new WheelVector(0.7428167306251503, 20.65712982473279),
                                new WheelVector(0.8253400619428924, -32.63219484137733))));
	}

	@Test
	void test195() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.2623238116376451, 177.36780515862267),
                                new WheelVector(0.7428167306251501, -110.65712982473279),
                                new WheelVector(0.4452227585191072, 1.550524473863708),
                                new WheelVector(0.8253400619428922, -57.367805158622666))));
	}

	@Test
	void test196() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6123724356957945, 170.26438968275465),
                                new WheelVector(0.8535533905932738, -135.0),
                                new WheelVector(0.14644660940672624, 44.99999999999998),
                                new WheelVector(0.6123724356957946, -80.26438968275465))));
	}

	@Test
	void test197() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8253400619428923, 147.3678051586227),
                                new WheelVector(0.7428167306251504, -159.3428701752672),
                                new WheelVector(0.4452227585191069, 88.44947552613631),
                                new WheelVector(0.26232381163764534, -87.36780515862267))));
	}

	@Test
	void test198() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8253400619428924, 122.63219484137736),
                                new WheelVector(0.4452227585191071, -178.44947552613633),
                                new WheelVector(0.7428167306251503, 69.34287017526721),
                                new WheelVector(0.26232381163764523, -2.632194841377323))));
	}

	@Test
	void test199() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7513512301775386, 109.76059817932111),
                                new WheelVector(0.3592455179659185, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7513512301775386, -19.760598179321093))));
	}

	@Test
	void test200() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4461054854224879, 113.28197635645219),
                                new WheelVector(0.6068601041928336, -106.89117457959846),
                                new WheelVector(0.9114444130406947, 26.717604395430733),
                                new WheelVector(1.0, -35.49832519617944))));
	}

	@Test
	void test201() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.44610548542248785, 156.71802364354784),
                                new WheelVector(0.9114444130406946, -116.71760439543074),
                                new WheelVector(0.6068601041928338, 16.891174579598456),
                                new WheelVector(1.0, -54.50167480382055))));
	}

	@Test
	void test202() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7513512301775386, 160.23940182067892),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.3592455179659185, 44.99999999999999),
                                new WheelVector(0.7513512301775386, -70.2394018206789))));
	}

	@Test
	void test203() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 144.50167480382058),
                                new WheelVector(0.9114444130406948, -153.28239560456927),
                                new WheelVector(0.6068601041928334, 73.10882542040154),
                                new WheelVector(0.446105485422488, -66.71802364354784))));
	}

	@Test
	void test204() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 125.49832519617944),
                                new WheelVector(0.6068601041928336, -163.10882542040156),
                                new WheelVector(0.9114444130406947, 63.282395604569274),
                                new WheelVector(0.4461054854224879, -23.281976356452173))));
	}

	@Test
	void test205() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7836116248912243, 115.52877936550931),
                                new WheelVector(0.47759225007251715, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7836116248912243, -25.528779365509312))));
	}

	@Test
	void test206() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5431934368354893, 120.70575538596037),
                                new WheelVector(0.6663562474808866, -114.59803029876787),
                                new WheelVector(0.9225120385471086, 30.41555594321144),
                                new WheelVector(1.0, -37.292530939589824))));
	}

	@Test
	void test207() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5431934368354893, 149.29424461403963),
                                new WheelVector(0.9225120385471086, -120.41555594321144),
                                new WheelVector(0.6663562474808868, 24.59803029876786),
                                new WheelVector(1.0, -52.707469060410176))));
	}

	@Test
	void test208() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7836116248912242, 154.4712206344907),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.47759225007251704, 45.0),
                                new WheelVector(0.7836116248912243, -64.47122063449069))));
	}

	@Test
	void test209() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 142.70746906041018),
                                new WheelVector(0.9225120385471086, -149.58444405678856),
                                new WheelVector(0.6663562474808866, 65.40196970123215),
                                new WheelVector(0.5431934368354894, -59.29424461403964))));
	}

	@Test
	void test210() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 127.29253093958982),
                                new WheelVector(0.6663562474808866, -155.40196970123216),
                                new WheelVector(0.9225120385471086, 59.58444405678857),
                                new WheelVector(0.5431934368354893, -30.705755385960362))));
	}

	@Test
	void test211() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, 26.56505117707799),
                                new WheelVector(0.5590169943749475, 26.56505117707799),
                                new WheelVector(0.5590169943749475, 26.56505117707799),
                                new WheelVector(0.5590169943749475, 26.56505117707799))));
	}

	@Test
	void test212() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, -33.434948822922),
                                new WheelVector(0.5590169943749475, -33.434948822922),
                                new WheelVector(0.5590169943749475, -33.434948822922),
                                new WheelVector(0.5590169943749475, -33.434948822922))));
	}

	@Test
	void test213() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749473, -93.43494882292201),
                                new WheelVector(0.5590169943749473, -93.43494882292201),
                                new WheelVector(0.5590169943749473, -93.43494882292201),
                                new WheelVector(0.5590169943749473, -93.43494882292201))));
	}

	@Test
	void test214() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, -153.434948822922),
                                new WheelVector(0.5590169943749475, -153.434948822922),
                                new WheelVector(0.5590169943749475, -153.434948822922),
                                new WheelVector(0.5590169943749475, -153.434948822922))));
	}

	@Test
	void test215() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, 146.565051177078),
                                new WheelVector(0.5590169943749475, 146.565051177078),
                                new WheelVector(0.5590169943749475, 146.565051177078),
                                new WheelVector(0.5590169943749475, 146.565051177078))));
	}

	@Test
	void test216() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749473, 86.56505117707799),
                                new WheelVector(0.5590169943749473, 86.56505117707799),
                                new WheelVector(0.5590169943749473, 86.56505117707799),
                                new WheelVector(0.5590169943749473, 86.56505117707799))));
	}

	@Test
	void test217() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5353612353838122, 52.86119340482172),
                                new WheelVector(0.3314135740355918, 12.764389682754652),
                                new WheelVector(0.8001031451912655, 32.235610317245346),
                                new WheelVector(0.6807263382948529, 6.175050063104764))));
	}

	@Test
	void test218() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3180662867861318, -24.368634883850675),
                                new WheelVector(0.5647690085242786, -59.135761546586956),
                                new WheelVector(0.6565332946701967, -11.530666116826314),
                                new WheelVector(0.8055022266946766, -37.00232071247584))));
	}

	@Test
	void test219() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.435378582888773, -118.87888896787803),
                                new WheelVector(0.7642833741057382, -105.96922028002854),
                                new WheelVector(0.4072725427346509, -69.40186308197998),
                                new WheelVector(0.7486290734147076, -78.96585756823282))));
	}

	@Test
	void test220() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6807263382948529, -173.82494993689522),
                                new WheelVector(0.8001031451912656, -147.76438968275465),
                                new WheelVector(0.3314135740355917, -167.23561031724535),
                                new WheelVector(0.5353612353838122, -127.13880659517828))));
	}

	@Test
	void test221() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8055022266946766, 142.99767928752416),
                                new WheelVector(0.6565332946701968, 168.4693338831737),
                                new WheelVector(0.5647690085242785, 120.86423845341308),
                                new WheelVector(0.3180662867861318, 155.63136511614937))));
	}

	@Test
	void test222() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7486290734147076, 101.03414243176718),
                                new WheelVector(0.40727254273465086, 110.59813691802),
                                new WheelVector(0.7642833741057383, 74.03077971997145),
                                new WheelVector(0.4353785828887731, 61.12111103212195))));
	}

	@Test
	void test223() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.594102825849117, 76.36129272052355),
                                new WheelVector(0.1715728752538099, -35.26438968275467),
                                new WheelVector(1.0, 35.264389682754654),
                                new WheelVector(0.8224834854518072, -6.917337940107006))));
	}

	@Test
	void test224() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.11558735776853787, 21.95844358274006),
                                new WheelVector(0.6369691999543644, -80.31099027542865),
                                new WheelVector(0.7795066873256501, 3.1785634237916853),
                                new WheelVector(1.0, -38.89413015323176))));
	}

	@Test
	void test225() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.43773167680266467, -152.1545477812505),
                                new WheelVector(0.9903323441496314, -113.00586827201981),
                                new WheelVector(0.3797918484263401, -32.57109483370468),
                                new WheelVector(0.9661216171494806, -70.65332848472853))));
	}

	@Test
	void test226() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8224834854518072, 173.082662059893),
                                new WheelVector(1.0, -144.73561031724535),
                                new WheelVector(0.17157287525380982, 144.73561031724535),
                                new WheelVector(0.5941028258491171, -103.63870727947646))));
	}

	@Test
	void test227() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 141.10586984676826),
                                new WheelVector(0.7795066873256502, -176.82143657620833),
                                new WheelVector(0.6369691999543644, 99.68900972457136),
                                new WheelVector(0.11558735776853808, -158.04155641725987))));
	}

	@Test
	void test228() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9661216171494805, 109.34667151527147),
                                new WheelVector(0.37979184842634, 147.42890516629532),
                                new WheelVector(0.9903323441496314, 66.99413172798019),
                                new WheelVector(0.4377316768026648, 27.845452218749504))));
	}

	@Test
	void test229() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6042039371651623, 92.22586777264844),
                                new WheelVector(0.21815956666812703, -96.17505006310478),
                                new WheelVector(1.0, 37.13880659517829),
                                new WheelVector(0.826154464275865, -15.220484564564929))));
	}

	@Test
	void test230() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.1775798275907797, 106.01791864925374),
                                new WheelVector(0.6455047438738301, -94.3535774219024),
                                new WheelVector(0.7841289567434379, 12.572518600867207),
                                new WheelVector(1.0, -40.06394806625182))));
	}

	@Test
	void test231() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.46054836073001637, -177.18914916859447),
                                new WheelVector(1.0, -117.38673713212948),
                                new WheelVector(0.40597153126554353, -3.1890953761296217),
                                new WheelVector(0.9760676675451272, -65.46295573997244))));
	}

	@Test
	void test232() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.826154464275865, 164.7795154354351),
                                new WheelVector(1.0, -142.8611934048217),
                                new WheelVector(0.21815956666812697, 83.82494993689521),
                                new WheelVector(0.6042039371651623, -87.77413222735157))));
	}

	@Test
	void test233() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 139.9360519337482),
                                new WheelVector(0.7841289567434379, -167.4274813991328),
                                new WheelVector(0.6455047438738298, 85.64642257809763),
                                new WheelVector(0.17757982759077984, -73.98208135074631))));
	}

	@Test
	void test234() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.976067667545127, 114.53704426002754),
                                new WheelVector(0.4059715312655433, 176.81090462387039),
                                new WheelVector(1.0, 62.613262867870525),
                                new WheelVector(0.4605483607300164, 2.8108508314055385))));
	}

	@Test
	void test235() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6356728874873746, 102.20989182961294),
                                new WheelVector(0.3257606941142601, -114.37441691242364),
                                new WheelVector(1.0, 38.410660380350116),
                                new WheelVector(0.8378782787155113, -20.740657439561073))));
	}

	@Test
	void test236() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3003178695158022, 121.08436515941548),
                                new WheelVector(0.6723139479070886, -103.3340116609263),
                                new WheelVector(0.7988646807814794, 18.780904536682403),
                                new WheelVector(1.0, -40.85824502587236))));
	}

	@Test
	void test237() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5153365500919577, 168.61763206589097),
                                new WheelVector(1.0, -120.34468863214035),
                                new WheelVector(0.4706262894376694, 12.480349966307926),
                                new WheelVector(0.9777102558780838, -61.96692146199727))));
	}

	@Test
	void test238() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8378782787155113, 159.25934256043894),
                                new WheelVector(1.0, -141.58933961964988),
                                new WheelVector(0.3257606941142601, 65.62558308757636),
                                new WheelVector(0.6356728874873746, -77.79010817038706))));
	}

	@Test
	void test239() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 139.14175497412765),
                                new WheelVector(0.7988646807814794, -161.2190954633176),
                                new WheelVector(0.6723139479070885, 76.66598833907372),
                                new WheelVector(0.30031786951580225, -58.91563484058456))));
	}

	@Test
	void test240() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9777102558780837, 118.03307853800273),
                                new WheelVector(0.47062628943766927, -167.51965003369207),
                                new WheelVector(1.0, 59.65531136785966),
                                new WheelVector(0.5153365500919578, -11.382367934109045))));
	}

	@Test
	void test241() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, 18.43494882292201),
                                new WheelVector(0.7905694150420949, 18.43494882292201),
                                new WheelVector(0.7905694150420949, 18.43494882292201),
                                new WheelVector(0.7905694150420949, 18.43494882292201))));
	}

	@Test
	void test242() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.790569415042095, -41.56505117707799),
                                new WheelVector(0.790569415042095, -41.56505117707799),
                                new WheelVector(0.790569415042095, -41.56505117707799),
                                new WheelVector(0.790569415042095, -41.56505117707799))));
	}

	@Test
	void test243() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, -101.56505117707799),
                                new WheelVector(0.7905694150420949, -101.56505117707799),
                                new WheelVector(0.7905694150420949, -101.56505117707799),
                                new WheelVector(0.7905694150420949, -101.56505117707799))));
	}

	@Test
	void test244() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, -161.565051177078),
                                new WheelVector(0.7905694150420949, -161.565051177078),
                                new WheelVector(0.7905694150420949, -161.565051177078),
                                new WheelVector(0.7905694150420949, -161.565051177078))));
	}

	@Test
	void test245() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, 138.43494882292205),
                                new WheelVector(0.7905694150420949, 138.43494882292205),
                                new WheelVector(0.7905694150420949, 138.43494882292205),
                                new WheelVector(0.7905694150420949, 138.43494882292205))));
	}

	@Test
	void test246() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, 78.43494882292201),
                                new WheelVector(0.7905694150420949, 78.43494882292201),
                                new WheelVector(0.7905694150420949, 78.43494882292201),
                                new WheelVector(0.7905694150420949, 78.43494882292201))));
	}

	@Test
	void test247() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7004164482197759, 36.66845164972351),
                                new WheelVector(0.5663723168103069, 7.27951543543507),
                                new WheelVector(1.0, 24.72586777264842),
                                new WheelVector(0.9111500427000311, 4.517473515986132))));
	}

	@Test
	void test248() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5202953528869104, -39.979146752108534),
                                new WheelVector(0.7832409740776801, -59.40093783219277),
                                new WheelVector(0.8107039106613225, -24.352587618191723),
                                new WheelVector(1.0, -42.3901130354614))));
	}

	@Test
	void test249() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6794724351465292, -119.28782308396667),
                                new WheelVector(1.0, -109.41426435673137),
                                new WheelVector(0.5928948369845087, -88.24804971729115),
                                new WheelVector(0.9433141033605578, -88.89896234804682))));
	}

	@Test
	void test250() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9111500427000312, -175.48252648401387),
                                new WheelVector(1.0, -155.27413222735157),
                                new WheelVector(0.5663723168103069, -172.7204845645649),
                                new WheelVector(0.7004164482197759, -143.33154835027648))));
	}

	@Test
	void test251() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 137.60988696453862),
                                new WheelVector(0.8107039106613225, 155.64741238180832),
                                new WheelVector(0.7832409740776799, 120.59906216780728),
                                new WheelVector(0.5202953528869103, 140.0208532478915))));
	}

	@Test
	void test252() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9433141033605574, 91.10103765195318),
                                new WheelVector(0.5928948369845086, 91.75195028270883),
                                new WheelVector(1.0, 70.58573564326863),
                                new WheelVector(0.6794724351465292, 60.7121769160333))));
	}

	@Test
	void test253() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5740993140322965, 56.70091950815378),
                                new WheelVector(0.3257606941142601, -14.638806595178293),
                                new WheelVector(1.0, 28.675050063104766),
                                new WheelVector(0.8812094004590798, -5.360727762243871))));
	}

	@Test
	void test254() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.22713090247200368, -35.696683381572285),
                                new WheelVector(0.705216934964463, -74.83731959596768),
                                new WheelVector(0.74448473557023, -10.254169424884381),
                                new WheelVector(1.0, -42.895729287952925))));
	}

	@Test
	void test255() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5350751483731189, -140.57558895657564),
                                new WheelVector(1.0, -114.41392793557308),
                                new WheelVector(0.37451111559676703, -65.13875800071962),
                                new WheelVector(0.9240958615311617, -80.18975191669037))));
	}

	@Test
	void test256() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8812094004590798, 174.63927223775613),
                                new WheelVector(1.0, -151.32494993689522),
                                new WheelVector(0.3257606941142601, 165.3611934048217),
                                new WheelVector(0.5740993140322967, -123.29908049184621))));
	}

	@Test
	void test257() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 137.10427071204708),
                                new WheelVector(0.7444847355702301, 169.74583057511566),
                                new WheelVector(0.7052169349644629, 105.16268040403232),
                                new WheelVector(0.2271309024720036, 144.30331661842777))));
	}

	@Test
	void test258() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9240958615311614, 99.81024808330962),
                                new WheelVector(0.3745111155967668, 114.86124199928034),
                                new WheelVector(1.0, 65.58607206442692),
                                new WheelVector(0.5350751483731189, 39.42441104342433))));
	}

	@Test
	void test259() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5406612094489119, 74.27761319035658),
                                new WheelVector(0.23752766408079765, -51.91733794010702),
                                new WheelVector(1.0, 31.36129272052354),
                                new WheelVector(0.8741309099905575, -12.350100126209533))));
	}

	@Test
	void test260() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.03990682559408938, 5.426151505745644),
                                new WheelVector(0.686172372819783, -86.68083350947317),
                                new WheelVector(0.7285327923352974, 0.2967854133949843),
                                new WheelVector(1.0, -43.23728400862175))));
	}

	@Test
	void test261() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4953061939018526, -160.48051288014105),
                                new WheelVector(1.0, -117.82936291964621),
                                new WheelVector(0.30148967319295256, -33.293334399749256),
                                new WheelVector(0.9195476047081269, -74.09429864737163))));
	}

	@Test
	void test262() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8741309099905575, 167.64989987379047),
                                new WheelVector(1.0, -148.63870727947648),
                                new WheelVector(0.23752766408079756, 128.08266205989298),
                                new WheelVector(0.5406612094489119, -105.72238680964342))));
	}

	@Test
	void test263() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 136.7627159913783),
                                new WheelVector(0.7285327923352978, -179.703214586605),
                                new WheelVector(0.6861723728197828, 93.31916649052685),
                                new WheelVector(0.03990682559408947, -174.57384849425407))));
	}

	@Test
	void test264() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9195476047081268, 105.90570135262837),
                                new WheelVector(0.30148967319295233, 146.70666560025074),
                                new WheelVector(1.0, 62.17063708035378),
                                new WheelVector(0.49530619390185265, 19.51948711985897))));
	}

	@Test
	void test265() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5495604511855343, 87.43397797347895),
                                new WheelVector(0.26335448735433414, -84.63927223775615),
                                new WheelVector(1.0, 33.29908049184622),
                                new WheelVector(0.8759788219485765, -17.417084495378923))));
	}

	@Test
	void test266() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.12074463209565565, 122.33882803763484),
                                new WheelVector(0.6911697564635945, -95.36207396241542),
                                new WheelVector(0.7327097883404935, 8.003442002086675),
                                new WheelVector(1.0, -43.483466117931734))));
	}

	@Test
	void test267() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5059717553007798, -175.546838899211),
                                new WheelVector(1.0, -120.29447054585408),
                                new WheelVector(0.32211884458610324, -7.005252199338277),
                                new WheelVector(0.9207351046176822, -69.6815281606006))));
	}

	@Test
	void test268() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8759788219485765, 162.5829155046211),
                                new WheelVector(1.0, -146.7009195081538),
                                new WheelVector(0.2633544873543341, 95.36072776224387),
                                new WheelVector(0.5495604511855344, -92.56602202652107))));
	}

	@Test
	void test269() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 136.51653388206827),
                                new WheelVector(0.7327097883404936, -171.99655799791333),
                                new WheelVector(0.6911697564635941, 84.63792603758458),
                                new WheelVector(0.12074463209565578, -57.66117196236524))));
	}

	@Test
	void test270() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9207351046176819, 110.31847183939941),
                                new WheelVector(0.32211884458610296, 172.99474780066174),
                                new WheelVector(1.0, 59.705529454145925),
                                new WheelVector(0.5059717553007799, 4.453161100789011))));
	}

	@Test
	void test271() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 14.036243467926479),
                                new WheelVector(1.0, 14.036243467926479),
                                new WheelVector(1.0, 14.036243467926479),
                                new WheelVector(1.0, 14.036243467926479))));
	}

	@Test
	void test272() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -45.96375653207351),
                                new WheelVector(1.0, -45.96375653207351),
                                new WheelVector(1.0, -45.96375653207351),
                                new WheelVector(1.0, -45.96375653207351))));
	}

	@Test
	void test273() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -105.96375653207352),
                                new WheelVector(1.0, -105.96375653207352),
                                new WheelVector(1.0, -105.96375653207352),
                                new WheelVector(1.0, -105.96375653207352))));
	}

	@Test
	void test274() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -165.96375653207352),
                                new WheelVector(1.0, -165.96375653207352),
                                new WheelVector(1.0, -165.96375653207352),
                                new WheelVector(1.0, -165.96375653207352))));
	}

	@Test
	void test275() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 134.0362434679265),
                                new WheelVector(1.0, 134.0362434679265),
                                new WheelVector(1.0, 134.0362434679265),
                                new WheelVector(1.0, 134.0362434679265))));
	}

	@Test
	void test276() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.25, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 74.03624346792648),
                                new WheelVector(1.0, 74.03624346792648),
                                new WheelVector(1.0, 74.03624346792648),
                                new WheelVector(1.0, 74.03624346792648))));
	}

	@Test
	void test277() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7407661426988171, 27.403196277932942),
                                new WheelVector(0.660240939135938, 5.082915504621078),
                                new WheelVector(1.0, 19.933977973478942),
                                new WheelVector(0.9419042517911366, 3.56056025414058))));
	}

	@Test
	void test278() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6096617992173783, -46.272314177751014),
                                new WheelVector(0.8313414393933436, -59.541594825490236),
                                new WheelVector(0.8249599508899658, -32.27885113609792),
                                new WheelVector(1.0, -45.775641293966366))));
	}

	@Test
	void test279() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7451475848651316, -119.4781721635788),
                                new WheelVector(1.0, -111.51107874018801),
                                new WheelVector(0.6542307484142789, -97.46673321630065),
                                new WheelVector(0.9342231794064891, -95.22134331756772))));
	}

	@Test
	void test280() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9419042517911366, -176.43943974585943),
                                new WheelVector(1.0, -160.06602202652107),
                                new WheelVector(0.6602409391359381, -174.91708449537893),
                                new WheelVector(0.7407661426988171, -152.59680372206705))));
	}

	@Test
	void test281() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 134.22435870603366),
                                new WheelVector(0.8249599508899658, 147.7211488639021),
                                new WheelVector(0.8313414393933434, 120.4584051745098),
                                new WheelVector(0.6096617992173783, 133.72768582224901))));
	}

	@Test
	void test282() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.25, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.934223179406489, 84.77865668243228),
                                new WheelVector(0.6542307484142788, 82.53326678369933),
                                new WheelVector(1.0, 68.48892125981197),
                                new WheelVector(0.7451475848651317, 60.52182783642119))));
	}

	@Test
	void test283() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5967555538478875, 43.034690809091565),
                                new WheelVector(0.4417538780931909, -9.10081401222652),
                                new WheelVector(1.0, 24.032231190364072),
                                new WheelVector(0.9159854244266524, -4.374882555001477))));
	}

	@Test
	void test284() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.34683724540939914, -46.87139114207823),
                                new WheelVector(0.753357394615197, -71.65492080751201),
                                new WheelVector(0.7434707195187864, -19.905481617577966),
                                new WheelVector(1.0, -45.648966626522004))));
	}

	@Test
	void test285() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6057172048901011, -134.9808953898968),
                                new WheelVector(1.0, -115.3510932822623),
                                new WheelVector(0.4310292912284206, -83.72822346444873),
                                new WheelVector(0.9049270233543687, -87.01728103566458))));
	}

	@Test
	void test286() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9159854244266524, 175.62511744499852),
                                new WheelVector(1.0, -155.96776880963594),
                                new WheelVector(0.4417538780931909, 170.89918598777348),
                                new WheelVector(0.5967555538478877, -136.9653091909084))));
	}

	@Test
	void test287() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 134.351033373478),
                                new WheelVector(0.7434707195187866, 160.09451838242205),
                                new WheelVector(0.753357394615197, 108.345079192488),
                                new WheelVector(0.3468372454093991, 133.12860885792182))));
	}

	@Test
	void test288() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.25, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9049270233543686, 92.98271896433542),
                                new WheelVector(0.4310292912284206, 96.27177653555125),
                                new WheelVector(1.0, 64.6489067177377),
                                new WheelVector(0.6057172048901012, 45.01910461010319))));
	}

	@Test
	void test289() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5301975632748653, 58.956845185107724),
                                new WheelVector(0.31841297104272626, -30.831548350276496),
                                new WheelVector(1.0, 27.017473515986133),
                                new WheelVector(0.9056916495284978, -10.380510810110371))));
	}

	@Test
	void test290() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.1578948029621384, -48.5352870451079),
                                new WheelVector(0.7215724796935831, -81.66886796004614),
                                new WheelVector(0.7101154310049221, -9.591454365493972),
                                new WheelVector(1.0, -45.557858135416865))));
	}

	@Test
	void test291() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5420196130075752, -150.48634878369128),
                                new WheelVector(1.0, -118.14381058950404),
                                new WheelVector(0.3029270795973137, -61.81799166957115),
                                new WheelVector(0.8932970136905619, -80.78419785823101))));
	}

	@Test
	void test292() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9056916495284977, 169.61948918988963),
                                new WheelVector(1.0, -152.98252648401387),
                                new WheelVector(0.31841297104272615, 149.16845164972352),
                                new WheelVector(0.5301975632748653, -121.04315481489226))));
	}

	@Test
	void test293() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 134.44214186458316),
                                new WheelVector(0.7101154310049222, 170.40854563450605),
                                new WheelVector(0.7215724796935828, 98.33113203995389),
                                new WheelVector(0.15789480296213834, 131.46471295489218))));
	}

	@Test
	void test294() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.25, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8932970136905617, 99.21580214176899),
                                new WheelVector(0.30292707959731346, 118.18200833042881),
                                new WheelVector(1.0, 61.856189410495986),
                                new WheelVector(0.5420196130075752, 29.513651216308702))));
	}

	@Test
	void test295() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5114281453621343, 72.9848742473196),
                                new WheelVector(0.27739580897282934, -57.35010012620953),
                                new WheelVector(1.0, 29.277613190356572),
                                new WheelVector(0.9029893061200326, -14.990257455403082))));
	}

	@Test
	void test296() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.01733238012099924, -74.51081869906965),
                                new WheelVector(0.7131331113610453, -89.62810845654529),
                                new WheelVector(0.7012428800930346, -1.364855571071514),
                                new WheelVector(1.0, -45.48918130093014))));
	}

	@Test
	void test297() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5241675212201611, -164.0070271956363),
                                new WheelVector(1.0, -120.25702428215949),
                                new WheelVector(0.25939613616007295, -33.831216129360655),
                                new WheelVector(0.8902442165791851, -75.9929728043637))));
	}

	@Test
	void test298() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9029893061200326, 165.00974254459692),
                                new WheelVector(1.0, -150.72238680964344),
                                new WheelVector(0.27739580897282934, 122.64989987379046),
                                new WheelVector(0.5114281453621343, -107.01512575268042))));
	}

	@Test
	void test299() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 134.5108186990699),
                                new WheelVector(0.7012428800930348, 178.6351444289285),
                                new WheelVector(0.7131331113610451, 90.37189154345474),
                                new WheelVector(0.017332380120999108, 105.48918130093087))));
	}

	@Test
	void test300() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.25, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8902442165791848, 104.0070271956363),
                                new WheelVector(0.25939613616007273, 146.16878387063932),
                                new WheelVector(1.0, 59.74297571784051),
                                new WheelVector(0.5241675212201612, 15.992972804363704))));
	}

	@Test
	void test301() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 90.0),
                                new WheelVector(0.5, 90.0),
                                new WheelVector(0.5, 90.0),
                                new WheelVector(0.5, 90.0))));
	}

	@Test
	void test302() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 30.00000000000001),
                                new WheelVector(0.5, 30.00000000000001),
                                new WheelVector(0.5, 30.00000000000001),
                                new WheelVector(0.5, 30.00000000000001))));
	}

	@Test
	void test303() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.49999999999999994, -29.999999999999993),
                                new WheelVector(0.49999999999999994, -29.999999999999993),
                                new WheelVector(0.49999999999999994, -29.999999999999993),
                                new WheelVector(0.49999999999999994, -29.999999999999993))));
	}

	@Test
	void test304() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, -90.0),
                                new WheelVector(0.5, -90.0),
                                new WheelVector(0.5, -90.0),
                                new WheelVector(0.5, -90.0))));
	}

	@Test
	void test305() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, -149.99999999999997),
                                new WheelVector(0.5, -149.99999999999997),
                                new WheelVector(0.5, -149.99999999999997),
                                new WheelVector(0.5, -149.99999999999997))));
	}

	@Test
	void test306() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5, 149.99999999999997),
                                new WheelVector(0.5, 149.99999999999997),
                                new WheelVector(0.5, 149.99999999999997),
                                new WheelVector(0.5, 149.99999999999997))));
	}

	@Test
	void test307() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6994831629829533, 104.6388065951783),
                                new WheelVector(0.36840643955197516, 118.67505006310476),
                                new WheelVector(0.6994831629829533, 75.36119340482172),
                                new WheelVector(0.36840643955197516, 61.32494993689523))));
	}

	@Test
	void test308() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.497790356198641, 59.019465915996555),
                                new WheelVector(0.26649304573990845, 15.948086885773927),
                                new WheelVector(0.7442993057717218, 34.98723472563249),
                                new WheelVector(0.614169977510811, 6.847272873547404))));
	}

	@Test
	void test309() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.2664930457399084, -15.948086885773893),
                                new WheelVector(0.4977903561986408, -59.01946591599654),
                                new WheelVector(0.6141699775108111, -6.8472728735473884),
                                new WheelVector(0.7442993057717218, -34.987234725632476))));
	}

	@Test
	void test310() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.36840643955197516, -118.67505006310476),
                                new WheelVector(0.6994831629829533, -104.6388065951783),
                                new WheelVector(0.3684064395519752, -61.32494993689523),
                                new WheelVector(0.6994831629829533, -75.36119340482172))));
	}

	@Test
	void test311() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6141699775108109, -173.1527271264526),
                                new WheelVector(0.7442993057717218, -145.0127652743675),
                                new WheelVector(0.2664930457399084, -164.05191311422604),
                                new WheelVector(0.49779035619864104, -120.98053408400342))));
	}

	@Test
	void test312() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7442993057717218, 145.01276527436752),
                                new WheelVector(0.614169977510811, 173.15272712645262),
                                new WheelVector(0.497790356198641, 120.98053408400347),
                                new WheelVector(0.26649304573990845, 164.05191311422607))));
	}

	@Test
	void test313() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9238795325112867, 112.50000000000001),
                                new WheelVector(0.38268343236508984, 157.5),
                                new WheelVector(0.9238795325112867, 67.5),
                                new WheelVector(0.38268343236508984, 22.499999999999996))));
	}

	@Test
	void test314() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6087614290087207, 82.50000000000001),
                                new WheelVector(0.13052619222005155, -52.50000000000001),
                                new WheelVector(0.9914448613738105, 37.5),
                                new WheelVector(0.7933533402912353, -7.499999999999998))));
	}

	@Test
	void test315() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.1305261922200517, 52.500000000000036),
                                new WheelVector(0.6087614290087207, -82.50000000000001),
                                new WheelVector(0.7933533402912353, 7.500000000000011),
                                new WheelVector(0.9914448613738105, -37.49999999999999))));
	}

	@Test
	void test316() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3826834323650897, -157.5),
                                new WheelVector(0.9238795325112867, -112.50000000000001),
                                new WheelVector(0.38268343236508984, -22.499999999999993),
                                new WheelVector(0.9238795325112867, -67.5))));
	}

	@Test
	void test317() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7933533402912349, 172.5),
                                new WheelVector(0.9914448613738104, -142.5),
                                new WheelVector(0.13052619222005132, 127.50000000000001),
                                new WheelVector(0.6087614290087208, -97.49999999999999))));
	}

	@Test
	void test318() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9914448613738105, 142.5),
                                new WheelVector(0.7933533402912353, -172.5),
                                new WheelVector(0.6087614290087207, 97.5),
                                new WheelVector(0.13052619222005155, -127.50000000000001))));
	}

	@Test
	void test319() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 117.23572392039048),
                                new WheelVector(0.4584002243324191, -176.7267650541877),
                                new WheelVector(1.0, 62.764276079609516),
                                new WheelVector(0.4584002243324191, -3.2732349458123164))));
	}

	@Test
	void test320() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6343086743774511, 97.10883051074349),
                                new WheelVector(0.23935885067189017, -109.14458951757926),
                                new WheelVector(1.0, 39.00827799860619),
                                new WheelVector(0.809286824929511, -16.22484972764531))));
	}

	@Test
	void test321() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.23935885067189025, 109.14458951757923),
                                new WheelVector(0.634308674377451, -97.10883051074349),
                                new WheelVector(0.809286824929511, 16.224849727645314),
                                new WheelVector(1.0, -39.00827799860619))));
	}

	@Test
	void test322() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.45840022433241895, 176.7267650541877),
                                new WheelVector(0.9999999999999998, -117.23572392039048),
                                new WheelVector(0.4584002243324191, 3.2732349458123156),
                                new WheelVector(1.0, -62.7642760796095))));
	}

	@Test
	void test323() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8092868249295109, 163.77515027235472),
                                new WheelVector(1.0, -140.99172200139378),
                                new WheelVector(0.23935885067189008, 70.85541048242071),
                                new WheelVector(0.6343086743774513, -82.89116948925651))));
	}

	@Test
	void test324() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 140.9917220013938),
                                new WheelVector(0.809286824929511, -163.7751502723547),
                                new WheelVector(0.6343086743774511, 82.89116948925653),
                                new WheelVector(0.23935885067189017, -70.85541048242075))));
	}

	@Test
	void test325() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 120.36119340482172),
                                new WheelVector(0.5266837846116297, -163.67505006310478),
                                new WheelVector(1.0, 59.63880659517828),
                                new WheelVector(0.5266837846116297, -16.32494993689524))));
	}

	@Test
	void test326() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6688040044354339, 105.98053408400347),
                                new WheelVector(0.35804553849959175, -120.94808688577392),
                                new WheelVector(1.0, 40.012765274367524),
                                new WheelVector(0.8251653236113299, -21.8472728735474))));
	}

	@Test
	void test327() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.35804553849959186, 120.94808688577392),
                                new WheelVector(0.6688040044354339, -105.98053408400347),
                                new WheelVector(0.82516532361133, 21.847272873547407),
                                new WheelVector(1.0, -40.01276527436752))));
	}

	@Test
	void test328() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5266837846116293, 163.67505006310478),
                                new WheelVector(0.9999999999999999, -120.36119340482172),
                                new WheelVector(0.5266837846116296, 16.324949936895237),
                                new WheelVector(1.0, -59.63880659517828))));
	}

	@Test
	void test329() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8251653236113299, 158.1527271264526),
                                new WheelVector(1.0, -139.98723472563248),
                                new WheelVector(0.3580455384995917, 59.05191311422606),
                                new WheelVector(0.6688040044354341, -74.01946591599653))));
	}

	@Test
	void test330() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 139.98723472563248),
                                new WheelVector(0.8251653236113299, -158.1527271264526),
                                new WheelVector(0.6688040044354339, 74.01946591599655),
                                new WheelVector(0.35804553849959175, -59.05191311422608))));
	}

	@Test
	void test331() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, 63.43494882292201),
                                new WheelVector(0.5590169943749475, 63.43494882292201),
                                new WheelVector(0.5590169943749475, 63.43494882292201),
                                new WheelVector(0.5590169943749475, 63.43494882292201))));
	}

	@Test
	void test332() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749473, 3.434948822922018),
                                new WheelVector(0.5590169943749473, 3.434948822922018),
                                new WheelVector(0.5590169943749473, 3.434948822922018),
                                new WheelVector(0.5590169943749473, 3.434948822922018))));
	}

	@Test
	void test333() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, -56.56505117707798),
                                new WheelVector(0.5590169943749475, -56.56505117707798),
                                new WheelVector(0.5590169943749475, -56.56505117707798),
                                new WheelVector(0.5590169943749475, -56.56505117707798))));
	}

	@Test
	void test334() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, -116.56505117707799),
                                new WheelVector(0.5590169943749475, -116.56505117707799),
                                new WheelVector(0.5590169943749475, -116.56505117707799),
                                new WheelVector(0.5590169943749475, -116.56505117707799))));
	}

	@Test
	void test335() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, -176.56505117707798),
                                new WheelVector(0.5590169943749475, -176.56505117707798),
                                new WheelVector(0.5590169943749475, -176.56505117707798),
                                new WheelVector(0.5590169943749475, -176.56505117707798))));
	}

	@Test
	void test336() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5590169943749475, 123.43494882292201),
                                new WheelVector(0.5590169943749475, 123.43494882292201),
                                new WheelVector(0.5590169943749475, 123.43494882292201),
                                new WheelVector(0.5590169943749475, 123.43494882292201))));
	}

	@Test
	void test337() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6807263382948529, 83.82494993689524),
                                new WheelVector(0.3314135740355918, 77.23561031724536),
                                new WheelVector(0.8001031451912655, 57.764389682754654),
                                new WheelVector(0.5353612353838122, 37.13880659517829))));
	}

	@Test
	void test338() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4353785828887731, 28.87888896787805),
                                new WheelVector(0.40727254273465086, -20.598136918019986),
                                new WheelVector(0.7642833741057383, 15.969220280028543),
                                new WheelVector(0.7486290734147076, -11.034142431767169))));
	}

	@Test
	void test339() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.31806628678613175, -65.6313651161493),
                                new WheelVector(0.6565332946701966, -78.46933388317368),
                                new WheelVector(0.5647690085242786, -30.86423845341304),
                                new WheelVector(0.8055022266946766, -52.99767928752415))));
	}

	@Test
	void test340() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5353612353838122, -142.8611934048217),
                                new WheelVector(0.8001031451912655, -122.23561031724535),
                                new WheelVector(0.3314135740355918, -102.76438968275464),
                                new WheelVector(0.6807263382948529, -96.17505006310476))));
	}

	@Test
	void test341() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7486290734147075, 168.96585756823288),
                                new WheelVector(0.7642833741057384, -164.03077971997146),
                                new WheelVector(0.40727254273465074, 159.40186308198005),
                                new WheelVector(0.43537858288877324, -151.12111103212192))));
	}

	@Test
	void test342() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8055022266946766, 127.00232071247585),
                                new WheelVector(0.5647690085242786, 149.13576154658696),
                                new WheelVector(0.6565332946701967, 101.53066611682632),
                                new WheelVector(0.3180662867861318, 114.36863488385067))));
	}

	@Test
	void test343() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8224834854518072, 96.917337940107),
                                new WheelVector(0.1715728752538099, 125.26438968275468),
                                new WheelVector(1.0, 54.735610317245346),
                                new WheelVector(0.594102825849117, 13.63870727947646))));
	}

	@Test
	void test344() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4377316768026648, 62.1545477812505),
                                new WheelVector(0.37979184842634, -57.428905166295316),
                                new WheelVector(0.9903323441496314, 23.005868272019807),
                                new WheelVector(0.9661216171494805, -19.346671515271463))));
	}

	@Test
	void test345() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.11558735776853776, -111.95844358274005),
                                new WheelVector(0.7795066873256501, -93.17856342379169),
                                new WheelVector(0.6369691999543645, -9.689009724571337),
                                new WheelVector(1.0, -51.10586984676824))));
	}

	@Test
	void test346() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.594102825849117, -166.36129272052355),
                                new WheelVector(1.0, -125.26438968275465),
                                new WheelVector(0.17157287525380993, -54.735610317245325),
                                new WheelVector(0.8224834854518072, -83.08266205989298))));
	}

	@Test
	void test347() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9661216171494805, 160.65332848472855),
                                new WheelVector(0.9903323441496316, -156.9941317279802),
                                new WheelVector(0.3797918484263398, 122.5710948337047),
                                new WheelVector(0.437731676802665, -117.8454522187495))));
	}

	@Test
	void test348() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 128.89413015323177),
                                new WheelVector(0.6369691999543644, 170.31099027542868),
                                new WheelVector(0.7795066873256501, 86.82143657620831),
                                new WheelVector(0.11558735776853787, 68.04155641725994))));
	}

	@Test
	void test349() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.826154464275865, 105.22048456456493),
                                new WheelVector(0.21815956666812703, -173.82494993689522),
                                new WheelVector(1.0, 52.86119340482172),
                                new WheelVector(0.6042039371651623, -2.225867772648428))));
	}

	@Test
	void test350() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4605483607300164, 87.18914916859447),
                                new WheelVector(0.4059715312655433, -86.81090462387037),
                                new WheelVector(1.0, 27.38673713212948),
                                new WheelVector(0.976067667545127, -24.53704426002754))));
	}

	@Test
	void test351() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.17757982759077964, 163.98208135074623),
                                new WheelVector(0.7841289567434376, -102.57251860086721),
                                new WheelVector(0.6455047438738301, 4.353577421902399),
                                new WheelVector(1.0, -49.93605193374818))));
	}

	@Test
	void test352() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6042039371651623, 177.77413222735157),
                                new WheelVector(1.0, -127.13880659517828),
                                new WheelVector(0.21815956666812705, 6.175050063104775),
                                new WheelVector(0.826154464275865, -74.77951543543507))));
	}

	@Test
	void test353() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9760676675451269, 155.4629557399725),
                                new WheelVector(1.0, -152.61326286787053),
                                new WheelVector(0.4059715312655431, 93.18909537612964),
                                new WheelVector(0.46054836073001665, -92.81085083140555))));
	}

	@Test
	void test354() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 130.0639480662518),
                                new WheelVector(0.6455047438738301, -175.6464225780976),
                                new WheelVector(0.7841289567434379, 77.4274813991328),
                                new WheelVector(0.1775798275907797, -16.01791864925373))));
	}

	@Test
	void test355() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8378782787155113, 110.74065743956108),
                                new WheelVector(0.3257606941142601, -155.6255830875764),
                                new WheelVector(1.0, 51.58933961964989),
                                new WheelVector(0.6356728874873746, -12.209891829612939))));
	}

	@Test
	void test356() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5153365500919578, 101.38236793410906),
                                new WheelVector(0.47062628943766927, -102.48034996630794),
                                new WheelVector(1.0, 30.344688632140347),
                                new WheelVector(0.9777102558780837, -28.033078538002723))));
	}

	@Test
	void test357() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.300317869515802, 148.91563484058452),
                                new WheelVector(0.7988646807814792, -108.78090453668241),
                                new WheelVector(0.6723139479070886, 13.334011660926283),
                                new WheelVector(1.0, -49.141754974127636))));
	}

	@Test
	void test358() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6356728874873746, 167.79010817038707),
                                new WheelVector(1.0, -128.4106603803501),
                                new WheelVector(0.3257606941142602, 24.374416912423634),
                                new WheelVector(0.8378782787155115, -69.25934256043894))));
	}

	@Test
	void test359() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9777102558780836, 151.9669214619973),
                                new WheelVector(1.0, -149.65531136785967),
                                new WheelVector(0.470626289437669, 77.51965003369206),
                                new WheelVector(0.5153365500919579, -78.61763206589096))));
	}

	@Test
	void test360() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 130.85824502587238),
                                new WheelVector(0.6723139479070886, -166.66598833907372),
                                new WheelVector(0.7988646807814794, 71.2190954633176),
                                new WheelVector(0.3003178695158022, -31.084365159415466))));
	}

	@Test
	void test361() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7071067811865476, 45.0),
                                new WheelVector(0.7071067811865476, 45.0),
                                new WheelVector(0.7071067811865476, 45.0),
                                new WheelVector(0.7071067811865476, 45.0))));
	}

	@Test
	void test362() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7071067811865476, -14.999999999999993),
                                new WheelVector(0.7071067811865476, -14.999999999999993),
                                new WheelVector(0.7071067811865476, -14.999999999999993),
                                new WheelVector(0.7071067811865476, -14.999999999999993))));
	}

	@Test
	void test363() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7071067811865475, -74.99999999999999),
                                new WheelVector(0.7071067811865475, -74.99999999999999),
                                new WheelVector(0.7071067811865475, -74.99999999999999),
                                new WheelVector(0.7071067811865475, -74.99999999999999))));
	}

	@Test
	void test364() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7071067811865476, -135.0),
                                new WheelVector(0.7071067811865476, -135.0),
                                new WheelVector(0.7071067811865476, -135.0),
                                new WheelVector(0.7071067811865476, -135.0))));
	}

	@Test
	void test365() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7071067811865475, 165.00000000000003),
                                new WheelVector(0.7071067811865475, 165.00000000000003),
                                new WheelVector(0.7071067811865475, 165.00000000000003),
                                new WheelVector(0.7071067811865475, 165.00000000000003))));
	}

	@Test
	void test366() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7071067811865476, 105.0),
                                new WheelVector(0.7071067811865476, 105.0),
                                new WheelVector(0.7071067811865476, 105.0),
                                new WheelVector(0.7071067811865476, 105.0))));
	}

	@Test
	void test367() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.75, 64.47122063449069),
                                new WheelVector(0.4571067811865476, 45.0),
                                new WheelVector(0.9571067811865475, 45.0),
                                new WheelVector(0.75, 25.528779365509312))));
	}

	@Test
	void test368() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5062744138825336, -0.7057553859603538),
                                new WheelVector(0.6210662643417071, -35.40196970123214),
                                new WheelVector(0.8598120116029067, -0.4155559432114264),
                                new WheelVector(0.9320333780760737, -22.70746906041017))));
	}

	@Test
	void test369() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5062744138825334, -89.29424461403963),
                                new WheelVector(0.8598120116029064, -89.58444405678857),
                                new WheelVector(0.6210662643417071, -54.59803029876784),
                                new WheelVector(0.9320333780760736, -67.29253093958981))));
	}

	@Test
	void test370() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, -154.4712206344907),
                                new WheelVector(0.9571067811865476, -135.0),
                                new WheelVector(0.4571067811865476, -135.0),
                                new WheelVector(0.7500000000000001, -115.52877936550931))));
	}

	@Test
	void test371() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9320333780760736, 157.29253093958985),
                                new WheelVector(0.8598120116029067, 179.58444405678858),
                                new WheelVector(0.6210662643417069, 144.5980302987679),
                                new WheelVector(0.5062744138825336, 179.29424461403968))));
	}

	@Test
	void test372() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9320333780760737, 112.70746906041018),
                                new WheelVector(0.6210662643417071, 125.40196970123215),
                                new WheelVector(0.8598120116029067, 90.41555594321143),
                                new WheelVector(0.5062744138825336, 90.70575538596036))));
	}

	@Test
	void test373() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143008, 80.26438968275465),
                                new WheelVector(0.17157287525380988, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7174389352143008, 9.735610317245344))));
	}

	@Test
	void test374() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3178372451957823, 27.36780515862268),
                                new WheelVector(0.5394415938940733, -58.4494755261363),
                                new WheelVector(0.9000129339129885, 9.342870175267215),
                                new WheelVector(1.0, -27.367805158622673))));
	}

	@Test
	void test375() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3178372451957821, -117.36780515862269),
                                new WheelVector(0.9000129339129885, -99.34287017526722),
                                new WheelVector(0.5394415938940734, -31.550524473863675),
                                new WheelVector(1.0, -62.63219484137731))));
	}

	@Test
	void test376() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143007, -170.26438968275465),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.17157287525380988, -134.99999999999997),
                                new WheelVector(0.7174389352143008, -99.73561031724536))));
	}

	@Test
	void test377() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 152.63219484137733),
                                new WheelVector(0.9000129339129886, -170.65712982473278),
                                new WheelVector(0.5394415938940732, 121.55052447386373),
                                new WheelVector(0.31783724519578244, -152.6321948413773))));
	}

	@Test
	void test378() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 117.36780515862269),
                                new WheelVector(0.5394415938940733, 148.4494755261363),
                                new WheelVector(0.9000129339129885, 80.65712982473278),
                                new WheelVector(0.3178372451957823, 62.63219484137731))));
	}

	@Test
	void test379() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7074130871623807, 91.68614334171696),
                                new WheelVector(0.02943725152285948, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7074130871623807, -1.6861433417169525))));
	}

	@Test
	void test380() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.269552965091232, 66.26944749190652),
                                new WheelVector(0.5182943710431929, -77.91880178409686),
                                new WheelVector(0.8966770577718692, 15.973682699593043),
                                new WheelVector(1.0, -30.451921847462938))));
	}

	@Test
	void test381() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.26955296509123183, -156.26944749190656),
                                new WheelVector(0.8966770577718692, -105.97368269959304),
                                new WheelVector(0.5182943710431931, -12.081198215903123),
                                new WheelVector(1.0, -59.54807815253705))));
	}

	@Test
	void test382() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7074130871623806, 178.31385665828304),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.029437251522859444, 44.999999999999844),
                                new WheelVector(0.7074130871623808, -88.31385665828304))));
	}

	@Test
	void test383() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 149.54807815253707),
                                new WheelVector(0.8966770577718693, -164.02631730040693),
                                new WheelVector(0.5182943710431928, 102.08119821590316),
                                new WheelVector(0.2695529650912322, -113.73055250809347))));
	}

	@Test
	void test384() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 120.45192184746294),
                                new WheelVector(0.5182943710431929, 167.91880178409687),
                                new WheelVector(0.8966770577718692, 74.02631730040696),
                                new WheelVector(0.269552965091232, 23.730552508093478))));
	}

	@Test
	void test385() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143008, 99.73561031724536),
                                new WheelVector(0.17157287525380996, -135.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7174389352143008, -9.73561031724535))));
	}

	@Test
	void test386() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.31783724519578227, 92.63219484137733),
                                new WheelVector(0.5394415938940733, -91.5505244738637),
                                new WheelVector(0.9000129339129885, 20.65712982473279),
                                new WheelVector(1.0, -32.63219484137733))));
	}

	@Test
	void test387() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3178372451957822, 177.36780515862267),
                                new WheelVector(0.9000129339129885, -110.65712982473279),
                                new WheelVector(0.5394415938940735, 1.550524473863708),
                                new WheelVector(1.0, -57.367805158622666))));
	}

	@Test
	void test388() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143007, 170.26438968275465),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.1715728752538099, 44.99999999999998),
                                new WheelVector(0.7174389352143008, -80.26438968275465))));
	}

	@Test
	void test389() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 147.3678051586227),
                                new WheelVector(0.9000129339129888, -159.3428701752672),
                                new WheelVector(0.5394415938940732, 88.44947552613631),
                                new WheelVector(0.31783724519578244, -87.36780515862267))));
	}

	@Test
	void test390() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 122.63219484137736),
                                new WheelVector(0.5394415938940733, -178.44947552613633),
                                new WheelVector(0.9000129339129885, 69.34287017526721),
                                new WheelVector(0.31783724519578227, -2.632194841377323))));
	}

	@Test
	void test391() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, 33.690067525979785),
                                new WheelVector(0.9013878188659973, 33.690067525979785),
                                new WheelVector(0.9013878188659973, 33.690067525979785),
                                new WheelVector(0.9013878188659973, 33.690067525979785))));
	}

	@Test
	void test392() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659974, -26.309932474020208),
                                new WheelVector(0.9013878188659974, -26.309932474020208),
                                new WheelVector(0.9013878188659974, -26.309932474020208),
                                new WheelVector(0.9013878188659974, -26.309932474020208))));
	}

	@Test
	void test393() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659972, -86.3099324740202),
                                new WheelVector(0.9013878188659972, -86.3099324740202),
                                new WheelVector(0.9013878188659972, -86.3099324740202),
                                new WheelVector(0.9013878188659972, -86.3099324740202))));
	}

	@Test
	void test394() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, -146.3099324740202),
                                new WheelVector(0.9013878188659973, -146.3099324740202),
                                new WheelVector(0.9013878188659973, -146.3099324740202),
                                new WheelVector(0.9013878188659973, -146.3099324740202))));
	}

	@Test
	void test395() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, 153.69006752597983),
                                new WheelVector(0.9013878188659973, 153.69006752597983),
                                new WheelVector(0.9013878188659973, 153.69006752597983),
                                new WheelVector(0.9013878188659973, 153.69006752597983))));
	}

	@Test
	void test396() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, 93.69006752597979),
                                new WheelVector(0.9013878188659973, 93.69006752597979),
                                new WheelVector(0.9013878188659973, 93.69006752597979),
                                new WheelVector(0.9013878188659973, 93.69006752597979))));
	}

	@Test
	void test397() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7728530170944006, 49.7357239203905),
                                new WheelVector(0.5734425080626623, 29.417337940107004),
                                new WheelVector(1.0, 36.13870727947646),
                                new WheelVector(0.8552979153612374, 19.226765054187695))));
	}

	@Test
	void test398() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5866527431163636, -19.436255639917803),
                                new WheelVector(0.749099141244091, -42.39495418320602),
                                new WheelVector(0.8848796062704347, -12.744867427893247),
                                new WheelVector(1.0, -30.336040483180064))));
	}

	@Test
	void test399() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6648787346479846, -99.3316816300425),
                                new WheelVector(0.9829532328468624, -96.29683579329902),
                                new WheelVector(0.6898309023398467, -72.00314290867301),
                                new WheelVector(1.0, -77.69395410376013))));
	}

	@Test
	void test400() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8552979153612374, -160.7732349458123),
                                new WheelVector(1.0, -143.86129272052355),
                                new WheelVector(0.5734425080626623, -150.58266205989298),
                                new WheelVector(0.7728530170944006, -130.2642760796095))));
	}

	@Test
	void test401() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 149.66395951681997),
                                new WheelVector(0.8848796062704347, 167.2551325721068),
                                new WheelVector(0.7490991412440909, 137.60504581679402),
                                new WheelVector(0.5866527431163636, 160.56374436008224))));
	}

	@Test
	void test402() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 102.30604589623985),
                                new WheelVector(0.6898309023398465, 107.99685709132697),
                                new WheelVector(0.9829532328468626, 83.70316420670096),
                                new WheelVector(0.6648787346479846, 80.66831836995749))));
	}

	@Test
	void test403() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6745821284644979, 65.08672953200221),
                                new WheelVector(0.3029330180190891, 20.274132227351576),
                                new WheelVector(1.0, 37.720484564564934),
                                new WheelVector(0.7979394496842863, 7.559245831736471))));
	}

	@Test
	void test404() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3299645526787305, -5.775461899920233),
                                new WheelVector(0.6353818328304861, -58.89012905893648),
                                new WheelVector(0.8397419440122345, -2.266134520376256),
                                new WheelVector(1.0, -32.95635357772843))));
	}

	@Test
	void test405() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.47070287366003055, -118.42745242427408),
                                new WheelVector(0.9761340913451488, -103.27084897473992),
                                new WheelVector(0.5183854077668384, -52.98986358226921),
                                new WheelVector(1.0, -71.81746307315483))));
	}

	@Test
	void test406() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7979394496842861, -172.4407541682635),
                                new WheelVector(1.0, -142.2795154354351),
                                new WheelVector(0.30293301801908895, -159.72586777264843),
                                new WheelVector(0.6745821284644978, -114.91327046799779))));
	}

	@Test
	void test407() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 147.0436464222716),
                                new WheelVector(0.8397419440122347, 177.73386547962377),
                                new WheelVector(0.635381832830486, 121.10987094106356),
                                new WheelVector(0.3299645526787306, 174.22453810007983))));
	}

	@Test
	void test408() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 108.18253692684517),
                                new WheelVector(0.5183854077668384, 127.01013641773076),
                                new WheelVector(0.9761340913451488, 76.72915102526008),
                                new WheelVector(0.4707028736600309, 61.57254757572593))));
	}

	@Test
	void test409() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6410338455837974, 77.9645436617347),
                                new WheelVector(0.1349344975901998, -7.861193404821733),
                                new WheelVector(1.0, 38.82494993689524),
                                new WheelVector(0.7792835988624218, -1.3570414154857793))));
	}

	@Test
	void test410() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.18835341604502243, 25.224238635890416),
                                new WheelVector(0.595478941107495, -73.37269684901489),
                                new WheelVector(0.8251556459440399, 5.582418008474878),
                                new WheelVector(1.0, -34.790665418812175))));
	}

	@Test
	void test411() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3877257103509785, -141.98688154306933),
                                new WheelVector(0.9739210691722261, -108.27976988933851),
                                new WheelVector(0.4492315410671861, -32.10854138008063),
                                new WheelVector(1.0, -67.63420929089617))));
	}

	@Test
	void test412() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7792835988624217, 178.64295858451422),
                                new WheelVector(1.0, -141.17505006310478),
                                new WheelVector(0.1349344975901997, 172.1388065951783),
                                new WheelVector(0.6410338455837975, -102.03545633826532))));
	}

	@Test
	void test413() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 145.20933458118785),
                                new WheelVector(0.8251556459440401, -174.4175819915251),
                                new WheelVector(0.5954789411074949, 106.62730315098514),
                                new WheelVector(0.18835341604502262, -154.77576136410954))));
	}

	@Test
	void test414() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 112.36579070910383),
                                new WheelVector(0.4492315410671859, 147.89145861991935),
                                new WheelVector(0.9739210691722262, 71.72023011066148),
                                new WheelVector(0.3877257103509787, 38.01311845693067))));
	}

	@Test
	void test415() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6383546034260774, 87.96491341199834),
                                new WheelVector(0.11177805177571416, -78.29908049184624),
                                new WheelVector(1.0, 39.63927223775613),
                                new WheelVector(0.7778160021132953, -8.089585067396158))));
	}

	@Test
	void test416() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.17253625275855866, 71.83762598161385),
                                new WheelVector(0.5922630557184001, -84.78998279952818),
                                new WheelVector(0.8240104558481455, 11.475783942412084),
                                new WheelVector(1.0, -36.14396225809594))));
	}

	@Test
	void test417() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.38044878585838937, -163.48848988287548),
                                new WheelVector(0.9737471839499201, -111.999236841182),
                                new WheelVector(0.44334828341916827, -14.116026977675343),
                                new WheelVector(1.0, -64.53492347571476))));
	}

	@Test
	void test418() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7778160021132953, 171.91041493260386),
                                new WheelVector(1.0, -140.36072776224387),
                                new WheelVector(0.11177805177571407, 101.70091950815376),
                                new WheelVector(0.6383546034260775, -92.03508658800166))));
	}

	@Test
	void test419() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 143.8560377419041),
                                new WheelVector(0.8240104558481456, -168.52421605758792),
                                new WheelVector(0.5922630557183999, 95.21001720047185),
                                new WheelVector(0.17253625275855888, -108.16237401838615))));
	}

	@Test
	void test420() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 115.46507652428524),
                                new WheelVector(0.44334828341916804, 165.88397302232465),
                                new WheelVector(0.9737471839499201, 68.000763158818),
                                new WheelVector(0.38044878585838954, 16.51151011712453))));
	}

	@Test
	void test421() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 26.56505117707799),
                                new WheelVector(1.0, 26.56505117707799),
                                new WheelVector(1.0, 26.56505117707799),
                                new WheelVector(1.0, 26.56505117707799))));
	}

	@Test
	void test422() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -33.434948822922),
                                new WheelVector(1.0, -33.434948822922),
                                new WheelVector(1.0, -33.434948822922),
                                new WheelVector(1.0, -33.434948822922))));
	}

	@Test
	void test423() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -93.43494882292201),
                                new WheelVector(1.0, -93.43494882292201),
                                new WheelVector(1.0, -93.43494882292201),
                                new WheelVector(1.0, -93.43494882292201))));
	}

	@Test
	void test424() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -153.434948822922),
                                new WheelVector(1.0, -153.434948822922),
                                new WheelVector(1.0, -153.434948822922),
                                new WheelVector(1.0, -153.434948822922))));
	}

	@Test
	void test425() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 146.565051177078),
                                new WheelVector(1.0, 146.565051177078),
                                new WheelVector(1.0, 146.565051177078),
                                new WheelVector(1.0, 146.565051177078))));
	}

	@Test
	void test426() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.5, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 86.56505117707799),
                                new WheelVector(1.0, 86.56505117707799),
                                new WheelVector(1.0, 86.56505117707799),
                                new WheelVector(1.0, 86.56505117707799))));
	}

	@Test
	void test427() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7850433187110758, 39.423823809056856),
                                new WheelVector(0.6514902289208563, 21.436529825399127),
                                new WheelVector(1.0, 29.903661920510782),
                                new WheelVector(0.8989696914392886, 15.358583222750433))));
	}

	@Test
	void test428() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6412200166097284, -30.14954014664204),
                                new WheelVector(0.8033263708591978, -46.35225450480833),
                                new WheelVector(0.8751170502185242, -21.5933943730637),
                                new WheelVector(1.0, -35.54093853865527))));
	}

	@Test
	void test429() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7375935534711784, -104.54903378546216),
                                new WheelVector(1.0, -100.67802511546016),
                                new WheelVector(0.7188020416833379, -83.3329140013365),
                                new WheelVector(0.9862211339278301, -85.14588359743577))));
	}

	@Test
	void test430() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8989696914392886, -164.64141677724956),
                                new WheelVector(1.0, -150.09633807948921),
                                new WheelVector(0.6514902289208563, -158.56347017460087),
                                new WheelVector(0.7850433187110758, -140.57617619094316))));
	}

	@Test
	void test431() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 144.45906146134476),
                                new WheelVector(0.8751170502185243, 158.40660562693634),
                                new WheelVector(0.8033263708591978, 133.64774549519169),
                                new WheelVector(0.6412200166097285, 149.850459853358))));
	}

	@Test
	void test432() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.5, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9862211339278301, 94.85411640256423),
                                new WheelVector(0.7188020416833379, 96.6670859986635),
                                new WheelVector(1.0, 79.32197488453983),
                                new WheelVector(0.7375935534711785, 75.45096621453783))));
	}

	@Test
	void test433() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6691152742010951, 52.86119340482172),
                                new WheelVector(0.4142135623730951, 12.764389682754652),
                                new WheelVector(1.0, 32.235610317245346),
                                new WheelVector(0.8507982281860978, 6.175050063104764))));
	}

	@Test
	void test434() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.39486704846403103, -24.368634883850675),
                                new WheelVector(0.7011389786490965, -59.135761546586956),
                                new WheelVector(0.8150608066773897, -11.530666116826314),
                                new WheelVector(1.0, -37.00232071247584))));
	}

	@Test
	void test435() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5696559648418292, -118.87888896787803),
                                new WheelVector(1.0, -105.96922028002854),
                                new WheelVector(0.5328815940961512, -69.40186308197998),
                                new WheelVector(0.97951767469841, -78.96585756823282))));
	}

	@Test
	void test436() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8507982281860977, -173.82494993689522),
                                new WheelVector(1.0, -147.76438968275465),
                                new WheelVector(0.4142135623730949, -167.23561031724535),
                                new WheelVector(0.669115274201095, -127.13880659517828))));
	}

	@Test
	void test437() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 142.99767928752416),
                                new WheelVector(0.8150608066773898, 168.4693338831737),
                                new WheelVector(0.7011389786490964, 120.86423845341308),
                                new WheelVector(0.39486704846403103, 155.63136511614937))));
	}

	@Test
	void test438() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.5, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9795176746984098, 101.03414243176718),
                                new WheelVector(0.5328815940961511, 110.59813691802),
                                new WheelVector(1.0, 74.03077971997145),
                                new WheelVector(0.5696559648418292, 61.12111103212195))));
	}

	@Test
	void test439() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6137768939828058, 65.49440832351412),
                                new WheelVector(0.2551139223577788, -3.6948849019885017),
                                new WheelVector(1.0, 33.95132206551776),
                                new WheelVector(0.8296752604444647, -1.1354141478194022))));
	}

	@Test
	void test440() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.22147532083343086, -12.01395111343848),
                                new WheelVector(0.6536260416037705, -70.64505148562168),
                                new WheelVector(0.7885583779756938, -3.3514900193544355),
                                new WheelVector(1.0, -38.07448779689519))));
	}

	@Test
	void test441() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4776601905061534, -135.5628628623248),
                                new WheelVector(1.0, -109.94137470937837),
                                new WheelVector(0.4264164488972979, -51.652525687058365),
                                new WheelVector(0.9765611759105557, -74.28151636026418))));
	}

	@Test
	void test442() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8296752604444646, 178.8645858521806),
                                new WheelVector(1.0, -146.04867793448224),
                                new WheelVector(0.25511392235777874, 176.3051150980115),
                                new WheelVector(0.613776893982806, -114.50559167648588))));
	}

	@Test
	void test443() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 141.92551220310483),
                                new WheelVector(0.788558377975694, 176.64850998064557),
                                new WheelVector(0.6536260416037702, 109.35494851437835),
                                new WheelVector(0.22147532083343097, 167.98604888656158))));
	}

	@Test
	void test444() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.5, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9765611759105555, 105.71848363973582),
                                new WheelVector(0.42641644889729774, 128.3474743129416),
                                new WheelVector(1.0, 70.05862529062163),
                                new WheelVector(0.4776601905061535, 44.437137137675165))));
	}

	@Test
	void test445() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.594102825849117, 76.36129272052355),
                                new WheelVector(0.1715728752538099, -35.26438968275467),
                                new WheelVector(1.0, 35.264389682754654),
                                new WheelVector(0.8224834854518072, -6.917337940107006))));
	}

	@Test
	void test446() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.11558735776853787, 21.95844358274006),
                                new WheelVector(0.6369691999543644, -80.31099027542865),
                                new WheelVector(0.7795066873256501, 3.1785634237916853),
                                new WheelVector(1.0, -38.89413015323176))));
	}

	@Test
	void test447() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4420048273577611, -152.1545477812505),
                                new WheelVector(1.0, -113.00586827201981),
                                new WheelVector(0.38349938853350884, -32.57109483370468),
                                new WheelVector(0.9755529271126252, -70.65332848472853))));
	}

	@Test
	void test448() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8224834854518072, 173.082662059893),
                                new WheelVector(1.0, -144.73561031724535),
                                new WheelVector(0.17157287525380982, 144.73561031724535),
                                new WheelVector(0.5941028258491171, -103.63870727947646))));
	}

	@Test
	void test449() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 141.10586984676826),
                                new WheelVector(0.7795066873256502, -176.82143657620833),
                                new WheelVector(0.6369691999543644, 99.68900972457136),
                                new WheelVector(0.11558735776853808, -158.04155641725987))));
	}

	@Test
	void test450() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.5, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9755529271126251, 109.34667151527147),
                                new WheelVector(0.38349938853350873, 147.42890516629532),
                                new WheelVector(1.0, 66.99413172798019),
                                new WheelVector(0.4420048273577612, 27.845452218749504))));
	}

	@Test
	void test451() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.75, 90.0),
                                new WheelVector(0.75, 90.0),
                                new WheelVector(0.75, 90.0),
                                new WheelVector(0.75, 90.0))));
	}

	@Test
	void test452() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 30.00000000000001),
                                new WheelVector(0.7500000000000001, 30.00000000000001),
                                new WheelVector(0.7500000000000001, 30.00000000000001),
                                new WheelVector(0.7500000000000001, 30.00000000000001))));
	}

	@Test
	void test453() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7499999999999999, -29.999999999999993),
                                new WheelVector(0.7499999999999999, -29.999999999999993),
                                new WheelVector(0.7499999999999999, -29.999999999999993),
                                new WheelVector(0.7499999999999999, -29.999999999999993))));
	}

	@Test
	void test454() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.75, -90.0),
                                new WheelVector(0.75, -90.0),
                                new WheelVector(0.75, -90.0),
                                new WheelVector(0.75, -90.0))));
	}

	@Test
	void test455() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.75, -149.99999999999997),
                                new WheelVector(0.75, -149.99999999999997),
                                new WheelVector(0.75, -149.99999999999997),
                                new WheelVector(0.75, -149.99999999999997))));
	}

	@Test
	void test456() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7500000000000001, 149.99999999999997),
                                new WheelVector(0.7500000000000001, 149.99999999999997),
                                new WheelVector(0.7500000000000001, 149.99999999999997),
                                new WheelVector(0.7500000000000001, 149.99999999999997))));
	}

	@Test
	void test457() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9434855817366555, 100.79908049184624),
                                new WheelVector(0.5998624484455122, 107.13927223775615),
                                new WheelVector(0.9434855817366555, 79.20091950815377),
                                new WheelVector(0.5998624484455122, 72.86072776224387))));
	}

	@Test
	void test458() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7265967644344109, 49.411224151633135),
                                new WheelVector(0.5126185864184009, 22.748555084773106),
                                new WheelVector(0.9935905519168349, 33.73386716216783),
                                new WheelVector(0.8497394553117121, 13.489984825546582))));
	}

	@Test
	void test459() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5126185864184007, -22.748555084773077),
                                new WheelVector(0.7265967644344108, -49.41122415163312),
                                new WheelVector(0.8497394553117121, -13.489984825546562),
                                new WheelVector(0.9935905519168348, -33.73386716216782))));
	}

	@Test
	void test460() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5998624484455122, -107.13927223775613),
                                new WheelVector(0.9434855817366555, -100.79908049184623),
                                new WheelVector(0.5998624484455122, -72.86072776224387),
                                new WheelVector(0.9434855817366555, -79.20091950815377))));
	}

	@Test
	void test461() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.849739455311712, -166.5100151744534),
                                new WheelVector(0.9935905519168349, -146.26613283783215),
                                new WheelVector(0.5126185864184007, -157.25144491522687),
                                new WheelVector(0.7265967644344109, -130.58877584836685))));
	}

	@Test
	void test462() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9935905519168349, 146.26613283783217),
                                new WheelVector(0.8497394553117121, 166.51001517445343),
                                new WheelVector(0.7265967644344109, 130.58877584836688),
                                new WheelVector(0.5126185864184009, 157.2514449152269))));
	}

	@Test
	void test463() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 107.76427607960952),
                                new WheelVector(0.4584002243324191, 131.7267650541877),
                                new WheelVector(1.0, 72.2357239203905),
                                new WheelVector(0.4584002243324191, 48.27323494581231))));
	}

	@Test
	void test464() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6343086743774512, 67.89116948925653),
                                new WheelVector(0.23935885067189017, 4.144589517579263),
                                new WheelVector(1.0, 35.99172200139382),
                                new WheelVector(0.8092868249295109, 1.2248497276453125))));
	}

	@Test
	void test465() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.23935885067189017, -4.144589517579209),
                                new WheelVector(0.6343086743774511, -67.89116948925653),
                                new WheelVector(0.809286824929511, -1.2248497276452968),
                                new WheelVector(1.0, -35.9917220013938))));
	}

	@Test
	void test466() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.458400224332419, -131.7267650541877),
                                new WheelVector(1.0, -107.76427607960952),
                                new WheelVector(0.4584002243324191, -48.273234945812305),
                                new WheelVector(1.0, -72.23572392039048))));
	}

	@Test
	void test467() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8092868249295107, -178.77515027235467),
                                new WheelVector(1.0, -144.00827799860616),
                                new WheelVector(0.23935885067188994, -175.8554104824207),
                                new WheelVector(0.6343086743774513, -112.10883051074346))));
	}

	@Test
	void test468() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 144.0082779986062),
                                new WheelVector(0.8092868249295109, 178.7751502723547),
                                new WheelVector(0.6343086743774512, 112.10883051074349),
                                new WheelVector(0.23935885067189017, 175.85541048242075))));
	}

	@Test
	void test469() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 112.50000000000001),
                                new WheelVector(0.41421356237309503, 157.50000000000003),
                                new WheelVector(1.0, 67.5),
                                new WheelVector(0.41421356237309503, 22.499999999999993))));
	}

	@Test
	void test470() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6140144073823545, 82.50000000000001),
                                new WheelVector(0.1316524975873958, -52.50000000000001),
                                new WheelVector(1.0, 37.50000000000001),
                                new WheelVector(0.8001991549907407, -7.499999999999998))));
	}

	@Test
	void test471() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.13165249758739594, 52.50000000000006),
                                new WheelVector(0.6140144073823541, -82.50000000000001),
                                new WheelVector(0.8001991549907407, 7.500000000000011),
                                new WheelVector(1.0, -37.49999999999999))));
	}

	@Test
	void test472() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4142135623730949, -157.5),
                                new WheelVector(1.0, -112.50000000000001),
                                new WheelVector(0.4142135623730951, -22.49999999999999),
                                new WheelVector(1.0, -67.5))));
	}

	@Test
	void test473() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8001991549907406, 172.5),
                                new WheelVector(1.0, -142.5),
                                new WheelVector(0.13165249758739558, 127.49999999999999),
                                new WheelVector(0.6140144073823545, -97.49999999999999))));
	}

	@Test
	void test474() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 142.5),
                                new WheelVector(0.8001991549907407, -172.5),
                                new WheelVector(0.6140144073823545, 97.5),
                                new WheelVector(0.1316524975873958, -127.50000000000001))));
	}

	@Test
	void test475() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 115.8864352982627),
                                new WheelVector(0.4373913178314939, 176.5286817554714),
                                new WheelVector(1.0, 64.11356470173732),
                                new WheelVector(0.4373913178314939, 3.4713182445285913))));
	}

	@Test
	void test476() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6244545533381018, 93.04630206248437),
                                new WheelVector(0.19423490531978055, -99.83734131375198),
                                new WheelVector(1.0, 38.57746332458298),
                                new WheelVector(0.8048501160215458, -13.755680262070399))));
	}

	@Test
	void test477() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.19423490531978072, 99.83734131375196),
                                new WheelVector(0.6244545533381017, -93.04630206248437),
                                new WheelVector(0.8048501160215459, 13.75568026207041),
                                new WheelVector(1.0, -38.57746332458297))));
	}

	@Test
	void test478() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4373913178314938, -176.5286817554714),
                                new WheelVector(1.0, -115.8864352982627),
                                new WheelVector(0.43739131783149393, -3.471318244528591),
                                new WheelVector(1.0, -64.11356470173732))));
	}

	@Test
	void test479() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8048501160215458, 166.24431973792963),
                                new WheelVector(1.0, -141.42253667541704),
                                new WheelVector(0.19423490531978044, 80.162658686248),
                                new WheelVector(0.624454553338102, -86.95369793751563))));
	}

	@Test
	void test480() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 141.42253667541704),
                                new WheelVector(0.8048501160215458, -166.2443197379296),
                                new WheelVector(0.6244545533381018, 86.95369793751564),
                                new WheelVector(0.19423490531978055, -80.16265868624804))));
	}

	@Test
	void test481() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, 71.56505117707799),
                                new WheelVector(0.7905694150420949, 71.56505117707799),
                                new WheelVector(0.7905694150420949, 71.56505117707799),
                                new WheelVector(0.7905694150420949, 71.56505117707799))));
	}

	@Test
	void test482() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, 11.565051177077999),
                                new WheelVector(0.7905694150420949, 11.565051177077999),
                                new WheelVector(0.7905694150420949, 11.565051177077999),
                                new WheelVector(0.7905694150420949, 11.565051177077999))));
	}

	@Test
	void test483() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420947, -48.434948822922),
                                new WheelVector(0.7905694150420947, -48.434948822922),
                                new WheelVector(0.7905694150420947, -48.434948822922),
                                new WheelVector(0.7905694150420947, -48.434948822922))));
	}

	@Test
	void test484() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, -108.43494882292202),
                                new WheelVector(0.7905694150420949, -108.43494882292202),
                                new WheelVector(0.7905694150420949, -108.43494882292202),
                                new WheelVector(0.7905694150420949, -108.43494882292202))));
	}

	@Test
	void test485() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7905694150420949, -168.434948822922),
                                new WheelVector(0.7905694150420949, -168.434948822922),
                                new WheelVector(0.7905694150420949, -168.434948822922),
                                new WheelVector(0.7905694150420949, -168.434948822922))));
	}

	@Test
	void test486() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.790569415042095, 131.56505117707798),
                                new WheelVector(0.790569415042095, 131.56505117707798),
                                new WheelVector(0.790569415042095, 131.56505117707798),
                                new WheelVector(0.790569415042095, 131.56505117707798))));
	}

	@Test
	void test487() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9111500427000311, 85.48252648401387),
                                new WheelVector(0.5663723168103069, 82.72048456456493),
                                new WheelVector(1.0, 65.27413222735159),
                                new WheelVector(0.7004164482197759, 53.33154835027649))));
	}

	@Test
	void test488() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6794724351465292, 29.287823083966703),
                                new WheelVector(0.5928948369845086, -1.751950282708825),
                                new WheelVector(1.0, 19.414264356731366),
                                new WheelVector(0.9433141033605574, -1.101037651953161))));
	}

	@Test
	void test489() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5202953528869102, -50.020853247891445),
                                new WheelVector(0.8107039106613223, -65.64741238180827),
                                new WheelVector(0.7832409740776802, -30.599062167807222),
                                new WheelVector(1.0, -47.60988696453859))));
	}

	@Test
	void test490() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7004164482197759, -126.66845164972352),
                                new WheelVector(1.0, -114.72586777264844),
                                new WheelVector(0.566372316810307, -97.27951543543507),
                                new WheelVector(0.9111500427000312, -94.51747351598614))));
	}

	@Test
	void test491() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9433141033605575, 178.89896234804687),
                                new WheelVector(1.0, -160.58573564326863),
                                new WheelVector(0.5928948369845086, 178.24804971729122),
                                new WheelVector(0.6794724351465294, -150.7121769160333))));
	}

	@Test
	void test492() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 132.3901130354614),
                                new WheelVector(0.7832409740776801, 149.40093783219277),
                                new WheelVector(0.8107039106613225, 114.35258761819173),
                                new WheelVector(0.5202953528869104, 129.97914675210856))));
	}

	@Test
	void test493() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8812094004590798, 95.36072776224388),
                                new WheelVector(0.3257606941142601, 104.6388065951783),
                                new WheelVector(1.0, 61.32494993689523),
                                new WheelVector(0.5740993140322965, 33.29908049184622))));
	}

	@Test
	void test494() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5350751483731189, 50.57558895657568),
                                new WheelVector(0.3745111155967668, -24.86124199928035),
                                new WheelVector(1.0, 24.413927935573092),
                                new WheelVector(0.9240958615311614, -9.810248083309615))));
	}

	@Test
	void test495() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.22713090247200352, -54.30331661842769),
                                new WheelVector(0.74448473557023, -79.74583057511562),
                                new WheelVector(0.705216934964463, -15.16268040403229),
                                new WheelVector(1.0, -47.10427071204707))));
	}

	@Test
	void test496() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5740993140322965, -146.7009195081538),
                                new WheelVector(1.0, -118.67505006310476),
                                new WheelVector(0.3257606941142601, -75.3611934048217),
                                new WheelVector(0.88120940045908, -84.63927223775613))));
	}

	@Test
	void test497() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9240958615311614, 170.18975191669043),
                                new WheelVector(1.0, -155.5860720644269),
                                new WheelVector(0.37451111559676664, 155.1387580007197),
                                new WheelVector(0.5350751483731191, -129.4244110434243))));
	}

	@Test
	void test498() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 132.89572928795292),
                                new WheelVector(0.705216934964463, 164.8373195959677),
                                new WheelVector(0.74448473557023, 100.2541694248844),
                                new WheelVector(0.22713090247200368, 125.69668338157227))));
	}

	@Test
	void test499() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8741309099905575, 102.35010012620954),
                                new WheelVector(0.23752766408079765, 141.91733794010705),
                                new WheelVector(1.0, 58.63870727947646),
                                new WheelVector(0.5406612094489119, 15.722386809643424))));
	}

	@Test
	void test500() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.49530619390185265, 70.48051288014103),
                                new WheelVector(0.30148967319295233, -56.70666560025073),
                                new WheelVector(1.0, 27.82936291964623),
                                new WheelVector(0.9195476047081268, -15.905701352628354))));
	}

	@Test
	void test501() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.039906825594089174, -95.42615150574568),
                                new WheelVector(0.7285327923352974, -90.29678541339499),
                                new WheelVector(0.686172372819783, -3.3191664905268152),
                                new WheelVector(1.0, -46.76271599137824))));
	}

	@Test
	void test502() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5406612094489118, -164.2776131903566),
                                new WheelVector(1.0, -121.36129272052355),
                                new WheelVector(0.23752766408079767, -38.08266205989297),
                                new WheelVector(0.8741309099905575, -77.64989987379046))));
	}

	@Test
	void test503() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9195476047081267, 164.09429864737166),
                                new WheelVector(1.0, -152.17063708035377),
                                new WheelVector(0.3014896731929522, 123.29333439974928),
                                new WheelVector(0.4953061939018528, -109.51948711985897))));
	}

	@Test
	void test504() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 133.23728400862174),
                                new WheelVector(0.686172372819783, 176.68083350947316),
                                new WheelVector(0.7285327923352974, 89.70321458660503),
                                new WheelVector(0.03990682559408938, 84.57384849425436))));
	}

	@Test
	void test505() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8759788219485765, 107.41708449537893),
                                new WheelVector(0.26335448735433414, 174.63927223775613),
                                new WheelVector(1.0, 56.70091950815378),
                                new WheelVector(0.5495604511855343, 2.566022026521055))));
	}

	@Test
	void test506() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5059717553007799, 85.54683889921098),
                                new WheelVector(0.32211884458610296, -82.99474780066173),
                                new WheelVector(1.0, 30.294470545854075),
                                new WheelVector(0.9207351046176819, -20.318471839399386))));
	}

	@Test
	void test507() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.12074463209565577, 147.66117196236507),
                                new WheelVector(0.7327097883404935, -98.00344200208669),
                                new WheelVector(0.6911697564635945, 5.362073962415434),
                                new WheelVector(1.0, -46.516533882068266))));
	}

	@Test
	void test508() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5495604511855343, -177.43397797347893),
                                new WheelVector(1.0, -123.29908049184624),
                                new WheelVector(0.26335448735433425, -5.3607277622438625),
                                new WheelVector(0.8759788219485767, -72.58291550462107))));
	}

	@Test
	void test509() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9207351046176819, 159.68152816060064),
                                new WheelVector(1.0, -149.7055294541459),
                                new WheelVector(0.32211884458610285, 97.00525219933827),
                                new WheelVector(0.5059717553007799, -94.45316110078902))));
	}

	@Test
	void test510() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 133.48346611793173),
                                new WheelVector(0.6911697564635945, -174.63792603758458),
                                new WheelVector(0.7327097883404935, 81.99655799791333),
                                new WheelVector(0.12074463209565565, -32.33882803763484))));
	}

	@Test
	void test511() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, 56.309932474020215),
                                new WheelVector(0.9013878188659973, 56.309932474020215),
                                new WheelVector(0.9013878188659973, 56.309932474020215),
                                new WheelVector(0.9013878188659973, 56.309932474020215))));
	}

	@Test
	void test512() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, -3.690067525979779),
                                new WheelVector(0.9013878188659973, -3.690067525979779),
                                new WheelVector(0.9013878188659973, -3.690067525979779),
                                new WheelVector(0.9013878188659973, -3.690067525979779))));
	}

	@Test
	void test513() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, -63.69006752597977),
                                new WheelVector(0.9013878188659973, -63.69006752597977),
                                new WheelVector(0.9013878188659973, -63.69006752597977),
                                new WheelVector(0.9013878188659973, -63.69006752597977))));
	}

	@Test
	void test514() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659974, -123.69006752597979),
                                new WheelVector(0.9013878188659974, -123.69006752597979),
                                new WheelVector(0.9013878188659974, -123.69006752597979),
                                new WheelVector(0.9013878188659974, -123.69006752597979))));
	}

	@Test
	void test515() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659973, 176.30993247402023),
                                new WheelVector(0.9013878188659973, 176.30993247402023),
                                new WheelVector(0.9013878188659973, 176.30993247402023),
                                new WheelVector(0.9013878188659973, 176.30993247402023))));
	}

	@Test
	void test516() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9013878188659974, 116.30993247402023),
                                new WheelVector(0.9013878188659974, 116.30993247402023),
                                new WheelVector(0.9013878188659974, 116.30993247402023),
                                new WheelVector(0.9013878188659974, 116.30993247402023))));
	}

	@Test
	void test517() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8552979153612374, 70.7732349458123),
                                new WheelVector(0.5734425080626623, 60.582662059893),
                                new WheelVector(1.0, 53.861292720523544),
                                new WheelVector(0.7728530170944006, 40.26427607960951))));
	}

	@Test
	void test518() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6648787346479846, 9.33168163004251),
                                new WheelVector(0.6898309023398465, -17.99685709132696),
                                new WheelVector(0.9829532328468626, 6.296835793299032),
                                new WheelVector(1.0, -12.306045896239844))));
	}

	@Test
	void test519() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5866527431163635, -70.56374436008218),
                                new WheelVector(0.8848796062704345, -77.25513257210675),
                                new WheelVector(0.749099141244091, -47.60504581679397),
                                new WheelVector(1.0, -59.66395951681993))));
	}

	@Test
	void test520() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7728530170944006, -139.73572392039048),
                                new WheelVector(1.0, -126.13870727947645),
                                new WheelVector(0.5734425080626624, -119.417337940107),
                                new WheelVector(0.8552979153612374, -109.2267650541877))));
	}

	@Test
	void test521() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 167.69395410376018),
                                new WheelVector(0.9829532328468626, -173.70316420670096),
                                new WheelVector(0.6898309023398465, 162.00314290867308),
                                new WheelVector(0.6648787346479847, -170.66831836995746))));
	}

	@Test
	void test522() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 120.33604048318006),
                                new WheelVector(0.749099141244091, 132.394954183206),
                                new WheelVector(0.8848796062704347, 102.74486742789325),
                                new WheelVector(0.5866527431163636, 109.4362556399178))));
	}

	@Test
	void test523() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7979394496842863, 82.44075416826354),
                                new WheelVector(0.3029330180190891, 69.72586777264843),
                                new WheelVector(1.0, 52.27951543543507),
                                new WheelVector(0.6745821284644979, 24.91327046799779))));
	}

	@Test
	void test524() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4707028736600309, 28.42745242427408),
                                new WheelVector(0.5183854077668384, -37.01013641773077),
                                new WheelVector(0.9761340913451488, 13.27084897473992),
                                new WheelVector(1.0, -18.18253692684517))));
	}

	@Test
	void test525() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.32996455267873037, -84.22453810007976),
                                new WheelVector(0.8397419440122343, -87.73386547962374),
                                new WheelVector(0.6353818328304862, -31.109870941063498),
                                new WheelVector(1.0, -57.043646422271564))));
	}

	@Test
	void test526() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6745821284644978, -155.0867295320022),
                                new WheelVector(1.0, -127.72048456456491),
                                new WheelVector(0.30293301801908906, -110.27413222735157),
                                new WheelVector(0.7979394496842863, -97.55924583173648))));
	}

	@Test
	void test527() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 161.81746307315484),
                                new WheelVector(0.9761340913451492, -166.72915102526008),
                                new WheelVector(0.5183854077668384, 142.98986358226927),
                                new WheelVector(0.47070287366003105, -151.5725475757259))));
	}

	@Test
	void test528() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 122.95635357772844),
                                new WheelVector(0.6353818328304861, 148.89012905893648),
                                new WheelVector(0.8397419440122345, 92.26613452037627),
                                new WheelVector(0.3299645526787305, 95.77546189992024))));
	}

	@Test
	void test529() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7792835988624218, 91.3570414154858),
                                new WheelVector(0.1349344975901998, 97.86119340482175),
                                new WheelVector(1.0, 51.17505006310476),
                                new WheelVector(0.6410338455837974, 12.035456338265316))));
	}

	@Test
	void test530() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3877257103509787, 51.98688154306934),
                                new WheelVector(0.4492315410671859, -57.89145861991934),
                                new WheelVector(0.9739210691722262, 18.279769889338517),
                                new WheelVector(1.0, -22.365790709103813))));
	}

	@Test
	void test531() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.1883534160450223, -115.2242386358904),
                                new WheelVector(0.8251556459440398, -95.58241800847489),
                                new WheelVector(0.595478941107495, -16.627303150985103),
                                new WheelVector(1.0, -55.20933458118782))));
	}

	@Test
	void test532() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6410338455837973, -167.9645436617347),
                                new WheelVector(1.0, -128.82494993689522),
                                new WheelVector(0.13493449759019988, -82.13880659517824),
                                new WheelVector(0.7792835988624219, -88.64295858451422))));
	}

	@Test
	void test533() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 157.6342092908962),
                                new WheelVector(0.9739210691722263, -161.72023011066148),
                                new WheelVector(0.4492315410671858, 122.10854138008068),
                                new WheelVector(0.3877257103509789, -128.01311845693064))));
	}

	@Test
	void test534() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 124.79066541881217),
                                new WheelVector(0.595478941107495, 163.3726968490149),
                                new WheelVector(0.8251556459440399, 84.41758199152513),
                                new WheelVector(0.18835341604502243, 64.77576136410958))));
	}

	@Test
	void test535() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7778160021132953, 98.08958506739616),
                                new WheelVector(0.11177805177571416, 168.29908049184624),
                                new WheelVector(1.0, 50.36072776224387),
                                new WheelVector(0.6383546034260774, 2.0350865880016595))));
	}

	@Test
	void test536() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.38044878585838954, 73.48848988287548),
                                new WheelVector(0.44334828341916804, -75.88397302232464),
                                new WheelVector(0.9737471839499201, 21.999236841181993),
                                new WheelVector(1.0, -25.465076524285234))));
	}

	@Test
	void test537() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.17253625275855852, -161.83762598161388),
                                new WheelVector(0.8240104558481454, -101.4757839424121),
                                new WheelVector(0.5922630557184002, -5.210017200471815),
                                new WheelVector(1.0, -53.85603774190405))));
	}

	@Test
	void test538() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6383546034260773, -177.96491341199834),
                                new WheelVector(1.0, -129.63927223775613),
                                new WheelVector(0.1117780517757142, -11.700919508153786),
                                new WheelVector(0.7778160021132953, -81.91041493260384))));
	}

	@Test
	void test539() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 154.53492347571478),
                                new WheelVector(0.9737471839499203, -158.00076315881802),
                                new WheelVector(0.44334828341916793, 104.11602697767538),
                                new WheelVector(0.3804487858583898, -106.51151011712453))));
	}

	@Test
	void test540() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 126.14396225809594),
                                new WheelVector(0.5922630557184001, 174.7899827995282),
                                new WheelVector(0.8240104558481455, 78.52421605758792),
                                new WheelVector(0.17253625275855866, 18.16237401838615))));
	}

	@Test
	void test541() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, 45.0))));
	}

	@Test
	void test542() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -14.999999999999996),
                                new WheelVector(1.0, -14.999999999999996),
                                new WheelVector(1.0, -14.999999999999996),
                                new WheelVector(1.0, -14.999999999999996))));
	}

	@Test
	void test543() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -74.99999999999999),
                                new WheelVector(1.0, -74.99999999999999),
                                new WheelVector(1.0, -74.99999999999999),
                                new WheelVector(1.0, -74.99999999999999))));
	}

	@Test
	void test544() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, -135.0))));
	}

	@Test
	void test545() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 165.00000000000003),
                                new WheelVector(1.0, 165.00000000000003),
                                new WheelVector(1.0, 165.00000000000003),
                                new WheelVector(1.0, 165.00000000000003))));
	}

	@Test
	void test546() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 105.00000000000001),
                                new WheelVector(1.0, 105.00000000000001),
                                new WheelVector(1.0, 105.00000000000001),
                                new WheelVector(1.0, 105.00000000000001))));
	}

	@Test
	void test547() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8314319450215446, 58.262676008304844),
                                new WheelVector(0.6185128603389077, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.8314319450215446, 31.737323991695153))));
	}

	@Test
	void test548() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6649879853013674, -6.577004373207671),
                                new WheelVector(0.7483876831175967, -28.02861052580162),
                                new WheelVector(0.9392150426569238, -4.651573421591085),
                                new WheelVector(1.0, -20.589901100714165))));
	}

	@Test
	void test549() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6649879853013673, -83.42299562679231),
                                new WheelVector(0.9392150426569237, -85.3484265784089),
                                new WheelVector(0.7483876831175967, -61.97138947419836),
                                new WheelVector(1.0, -69.41009889928581))));
	}

	@Test
	void test550() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8314319450215446, -148.26267600830485),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.6185128603389077, -135.0),
                                new WheelVector(0.8314319450215446, -121.73732399169515))));
	}

	@Test
	void test551() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 159.41009889928588),
                                new WheelVector(0.939215042656924, 175.34842657840895),
                                new WheelVector(0.7483876831175967, 151.9713894741984),
                                new WheelVector(0.6649879853013675, 173.42299562679236))));
	}

	@Test
	void test552() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 110.58990110071417),
                                new WheelVector(0.7483876831175967, 118.02861052580162),
                                new WheelVector(0.9392150426569238, 94.65157342159108),
                                new WheelVector(0.6649879853013674, 96.57700437320769))));
	}

	@Test
	void test553() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7513512301775385, 70.2394018206789),
                                new WheelVector(0.3592455179659186, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7513512301775385, 19.76059817932109))));
	}

	@Test
	void test554() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.44610548542248785, 6.718023643547837),
                                new WheelVector(0.6068601041928336, -43.10882542040155),
                                new WheelVector(0.9114444130406947, 3.282395604569276),
                                new WheelVector(1.0, -24.50167480382056))));
	}

	@Test
	void test555() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4461054854224877, -96.71802364354782),
                                new WheelVector(0.9114444130406947, -93.28239560456927),
                                new WheelVector(0.6068601041928338, -46.891174579598434),
                                new WheelVector(1.0, -65.49832519617942))));
	}

	@Test
	void test556() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7513512301775386, -160.23940182067892),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.3592455179659185, -135.0),
                                new WheelVector(0.7513512301775387, -109.7605981793211))));
	}

	@Test
	void test557() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 155.49832519617945),
                                new WheelVector(0.9114444130406948, -176.71760439543073),
                                new WheelVector(0.6068601041928335, 136.89117457959847),
                                new WheelVector(0.446105485422488, -173.28197635645213))));
	}

	@Test
	void test558() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 114.50167480382058),
                                new WheelVector(0.6068601041928336, 133.10882542040156),
                                new WheelVector(0.9114444130406947, 86.71760439543073),
                                new WheelVector(0.44610548542248785, 83.28197635645216))));
	}

	@Test
	void test559() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143008, 80.26438968275465),
                                new WheelVector(0.17157287525380985, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7174389352143008, 9.735610317245342))));
	}

	@Test
	void test560() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.31783724519578227, 27.36780515862269),
                                new WheelVector(0.5394415938940733, -58.4494755261363),
                                new WheelVector(0.9000129339129886, 9.342870175267215),
                                new WheelVector(1.0, -27.367805158622673))));
	}

	@Test
	void test561() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.31783724519578205, -117.36780515862269),
                                new WheelVector(0.9000129339129885, -99.34287017526722),
                                new WheelVector(0.5394415938940734, -31.550524473863675),
                                new WheelVector(1.0, -62.63219484137731))));
	}

	@Test
	void test562() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143007, -170.26438968275465),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.17157287525380985, -134.99999999999997),
                                new WheelVector(0.7174389352143009, -99.73561031724535))));
	}

	@Test
	void test563() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 152.63219484137733),
                                new WheelVector(0.9000129339129888, -170.65712982473278),
                                new WheelVector(0.5394415938940732, 121.55052447386373),
                                new WheelVector(0.31783724519578244, -152.63219484137727))));
	}

	@Test
	void test564() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 117.36780515862269),
                                new WheelVector(0.5394415938940733, 148.44947552613633),
                                new WheelVector(0.9000129339129886, 80.65712982473278),
                                new WheelVector(0.31783724519578227, 62.63219484137731))));
	}

	@Test
	void test565() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7074130871623807, 88.31385665828306),
                                new WheelVector(0.029437251522859385, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7074130871623807, 1.6861433417169471))));
	}

	@Test
	void test566() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.269552965091232, 53.730552508093496),
                                new WheelVector(0.518294371043193, -72.08119821590314),
                                new WheelVector(0.8966770577718691, 14.026317300406967),
                                new WheelVector(1.0, -29.548078152537062))));
	}

	@Test
	void test567() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.2695529650912318, -143.7305525080935),
                                new WheelVector(0.896677057771869, -104.02631730040697),
                                new WheelVector(0.518294371043193, -17.918801784096843),
                                new WheelVector(1.0, -60.451921847462934))));
	}

	@Test
	void test568() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7074130871623806, -178.31385665828304),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.029437251522859382, -134.99999999999986),
                                new WheelVector(0.7074130871623807, -91.68614334171696))));
	}

	@Test
	void test569() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 150.45192184746296),
                                new WheelVector(0.8966770577718693, -165.97368269959304),
                                new WheelVector(0.5182943710431929, 107.91880178409687),
                                new WheelVector(0.2695529650912322, -126.26944749190648))));
	}

	@Test
	void test570() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 119.54807815253709),
                                new WheelVector(0.518294371043193, 162.08119821590316),
                                new WheelVector(0.8966770577718691, 75.97368269959304),
                                new WheelVector(0.269552965091232, 36.269447491906504))));
	}

	@Test
	void test571() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 36.86989764584402),
                                new WheelVector(1.0, 36.86989764584402),
                                new WheelVector(1.0, 36.86989764584402),
                                new WheelVector(1.0, 36.86989764584402))));
	}

	@Test
	void test572() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -23.13010235415597),
                                new WheelVector(1.0, -23.13010235415597),
                                new WheelVector(1.0, -23.13010235415597),
                                new WheelVector(1.0, -23.13010235415597))));
	}

	@Test
	void test573() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -83.13010235415598),
                                new WheelVector(1.0, -83.13010235415598),
                                new WheelVector(1.0, -83.13010235415598),
                                new WheelVector(1.0, -83.13010235415598))));
	}

	@Test
	void test574() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -143.13010235415598),
                                new WheelVector(1.0, -143.13010235415598),
                                new WheelVector(1.0, -143.13010235415598),
                                new WheelVector(1.0, -143.13010235415598))));
	}

	@Test
	void test575() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 156.86989764584405),
                                new WheelVector(1.0, 156.86989764584405),
                                new WheelVector(1.0, 156.86989764584405),
                                new WheelVector(1.0, 156.86989764584405))));
	}

	@Test
	void test576() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 0.75, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 96.86989764584402),
                                new WheelVector(1.0, 96.86989764584402),
                                new WheelVector(1.0, 96.86989764584402),
                                new WheelVector(1.0, 96.86989764584402))));
	}

	@Test
	void test577() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8275569362555244, 48.386435298262676),
                                new WheelVector(0.6696927241676609, 34.85010012620953),
                                new WheelVector(1.0, 38.222386809643424),
                                new WheelVector(0.8738637548602601, 25.971318244528597))));
	}

	@Test
	void test578() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6884108489105688, -17.903279512444858),
                                new WheelVector(0.7945890352370024, -34.47017771694077),
                                new WheelVector(0.9178985575644509, -13.329686500334429),
                                new WheelVector(1.0, -26.725674756141935))));
	}

	@Test
	void test579() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7317502516437842, -91.4671443833194),
                                new WheelVector(0.9747050393982983, -91.10139172648975),
                                new WheelVector(0.7651199363186814, -72.95460346867502),
                                new WheelVector(1.0, -77.03951089681266))));
	}

	@Test
	void test580() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.87386375486026, -154.02868175547138),
                                new WheelVector(1.0, -141.77761319035656),
                                new WheelVector(0.6696927241676609, -145.14989987379047),
                                new WheelVector(0.8275569362555244, -131.61356470173735))));
	}

	@Test
	void test581() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 153.2743252438581),
                                new WheelVector(0.9178985575644512, 166.6703134996656),
                                new WheelVector(0.7945890352370025, 145.52982228305925),
                                new WheelVector(0.6884108489105689, 162.09672048755516))));
	}

	@Test
	void test582() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 0.75, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 102.96048910318734),
                                new WheelVector(0.7651199363186816, 107.04539653132498),
                                new WheelVector(0.9747050393982984, 88.89860827351025),
                                new WheelVector(0.7317502516437843, 88.5328556166806))));
	}

	@Test
	void test583() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.732334502931957, 59.63880659517828),
                                new WheelVector(0.43422251475832546, 31.519559498268393),
                                new WheelVector(1.0, 39.190394282542876),
                                new WheelVector(0.807610901448493, 16.324949936895237))));
	}

	@Test
	void test584() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4685037241839764, -9.798942458791677),
                                new WheelVector(0.6731312170842592, -46.697309985592675),
                                new WheelVector(0.8754370932059706, -5.22577147484693),
                                new WheelVector(1.0, -29.331701409975995))));
	}

	@Test
	void test585() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5446142725038956, -102.94759996557633),
                                new WheelVector(0.9614400847074674, -97.2916598332443),
                                new WheelVector(0.6101128332797512, -60.45283085197881),
                                new WheelVector(1.0, -72.49007548594504))));
	}

	@Test
	void test586() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.807610901448493, -163.67505006310478),
                                new WheelVector(1.0, -140.80960571745715),
                                new WheelVector(0.4342225147583253, -148.4804405017316),
                                new WheelVector(0.7323345029319571, -120.36119340482172))));
	}

	@Test
	void test587() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 150.66829859002402),
                                new WheelVector(0.8754370932059707, 174.7742285251531),
                                new WheelVector(0.673131217084259, 133.30269001440735),
                                new WheelVector(0.4685037241839765, 170.20105754120834))));
	}

	@Test
	void test588() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 0.75, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 107.50992451405496),
                                new WheelVector(0.6101128332797511, 119.5471691480212),
                                new WheelVector(0.9614400847074674, 82.7083401667557),
                                new WheelVector(0.5446142725038957, 77.05240003442367))));
	}

	@Test
	void test589() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6834907533149128, 69.85519419395426),
                                new WheelVector(0.2598640361174036, 25.066022026521058),
                                new WheelVector(1.0, 39.91708449537892),
                                new WheelVector(0.7748352775914634, 8.168673361842378))));
	}

	@Test
	void test590() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3155864139252662, 3.632130210883671),
                                new WheelVector(0.6075292584708339, -58.7739814421531),
                                new WheelVector(0.854694673410387, 1.340347492122641),
                                new WheelVector(1.0, -31.2997809622577))));
	}

	@Test
	void test591() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4249587619347357, -118.18368881143563),
                                new WheelVector(0.9549306186176629, -102.13294038818533),
                                new WheelVector(0.5183603601468684, -46.2707728011107),
                                new WheelVector(1.0, -69.00311600329397))));
	}

	@Test
	void test592() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7748352775914634, -171.8313266381576),
                                new WheelVector(1.0, -140.08291550462107),
                                new WheelVector(0.2598640361174036, -154.93397797347893),
                                new WheelVector(0.6834907533149129, -110.14480580604574))));
	}

	@Test
	void test593() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 148.70021903774233),
                                new WheelVector(0.8546946734103871, -178.65965250787735),
                                new WheelVector(0.6075292584708337, 121.22601855784693),
                                new WheelVector(0.3155864139252663, -176.3678697891163))));
	}

	@Test
	void test594() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 0.75, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 110.99688399670603),
                                new WheelVector(0.5183603601468683, 133.72922719888928),
                                new WheelVector(0.9549306186176629, 77.86705961181467),
                                new WheelVector(0.4249587619347358, 61.81631118856436))));
	}

	@Test
	void test595() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6622020529986063, 78.63442835063402),
                                new WheelVector(0.1318909710414088, 8.33154835027648),
                                new WheelVector(1.0, 40.48252648401387),
                                new WheelVector(0.7608440505429984, 1.43932614271427))));
	}

	@Test
	void test596() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.22282264873283714, 26.031638575679818),
                                new WheelVector(0.5780101731568613, -69.7332503049544),
                                new WheelVector(0.8459043518717068, 6.638441416377496),
                                new WheelVector(1.0, -32.8352759315065))));
	}

	@Test
	void test597() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3627529123158993, -136.24225329227792),
                                new WheelVector(0.9521678975532232, -105.97199960381325),
                                new WheelVector(0.47430577717622346, -31.93450395220412),
                                new WheelVector(1.0, -66.26411642281148))));
	}

	@Test
	void test598() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7608440505429983, -178.56067385728574),
                                new WheelVector(1.0, -139.51747351598613),
                                new WheelVector(0.1318909710414087, -171.6684516497235),
                                new WheelVector(0.6622020529986063, -101.36557164936598))));
	}

	@Test
	void test599() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 147.1647240684935),
                                new WheelVector(0.8459043518717071, -173.3615585836225),
                                new WheelVector(0.5780101731568611, 110.26674969504565),
                                new WheelVector(0.22282264873283733, -153.96836142432016))));
	}

	@Test
	void test600() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 0.75, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 113.73588357718853),
                                new WheelVector(0.47430577717622335, 148.06549604779585),
                                new WheelVector(0.9521678975532234, 74.02800039618677),
                                new WheelVector(0.36275291231589946, 43.75774670772207))));
	}

	@Test
	void test601() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 90.0),
                                new WheelVector(1.0, 90.0),
                                new WheelVector(1.0, 90.0),
                                new WheelVector(1.0, 90.0))));
	}

	@Test
	void test602() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 30.00000000000001),
                                new WheelVector(1.0, 30.00000000000001),
                                new WheelVector(1.0, 30.00000000000001),
                                new WheelVector(1.0, 30.00000000000001))));
	}

	@Test
	void test603() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9999999999999999, -29.999999999999993),
                                new WheelVector(0.9999999999999999, -29.999999999999993),
                                new WheelVector(0.9999999999999999, -29.999999999999993),
                                new WheelVector(0.9999999999999999, -29.999999999999993))));
	}

	@Test
	void test604() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -90.0),
                                new WheelVector(1.0, -90.0),
                                new WheelVector(1.0, -90.0),
                                new WheelVector(1.0, -90.0))));
	}

	@Test
	void test605() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -149.99999999999997),
                                new WheelVector(1.0, -149.99999999999997),
                                new WheelVector(1.0, -149.99999999999997),
                                new WheelVector(1.0, -149.99999999999997))));
	}

	@Test
	void test606() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 149.99999999999997),
                                new WheelVector(1.0, 149.99999999999997),
                                new WheelVector(1.0, 149.99999999999997),
                                new WheelVector(1.0, 149.99999999999997))));
	}

	@Test
	void test607() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 98.54315481489229),
                                new WheelVector(0.7075659915250843, 102.11948918988963),
                                new WheelVector(1.0, 81.45684518510772),
                                new WheelVector(0.7075659915250843, 77.88051081011038))));
	}

	@Test
	void test608() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7770206931527176, 44.47689562667078),
                                new WheelVector(0.612366357058668, 25.124237392252645),
                                new WheelVector(1.0, 32.98349874197314),
                                new WheelVector(0.878197812380431, 17.221163109694626))));
	}

	@Test
	void test609() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.612366357058668, -25.12423739225262),
                                new WheelVector(0.7770206931527175, -44.47689562667076),
                                new WheelVector(0.8781978123804308, -17.221163109694608),
                                new WheelVector(1.0, -32.983498741973136))));
	}

	@Test
	void test610() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7075659915250843, -102.11948918988963),
                                new WheelVector(1.0, -98.54315481489229),
                                new WheelVector(0.7075659915250843, -77.88051081011037),
                                new WheelVector(1.0, -81.45684518510771))));
	}

	@Test
	void test611() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8781978123804308, -162.77883689030537),
                                new WheelVector(1.0, -147.01650125802684),
                                new WheelVector(0.612366357058668, -154.87576260774733),
                                new WheelVector(0.7770206931527176, -135.5231043733292))));
	}

	@Test
	void test612() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 147.01650125802686),
                                new WheelVector(0.878197812380431, 162.77883689030537),
                                new WheelVector(0.7770206931527176, 135.5231043733292),
                                new WheelVector(0.612366357058668, 154.87576260774736))));
	}

	@Test
	void test613() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 104.6388065951783),
                                new WheelVector(0.5266837846116296, 118.67505006310476),
                                new WheelVector(1.0, 75.36119340482172),
                                new WheelVector(0.5266837846116296, 61.32494993689523))));
	}

	@Test
	void test614() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6688040044354339, 59.019465915996555),
                                new WheelVector(0.3580455384995918, 15.948086885773927),
                                new WheelVector(1.0, 34.98723472563249),
                                new WheelVector(0.82516532361133, 6.847272873547404))));
	}

	@Test
	void test615() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3580455384995917, -15.948086885773893),
                                new WheelVector(0.6688040044354336, -59.01946591599654),
                                new WheelVector(0.8251653236113301, -6.8472728735473884),
                                new WheelVector(1.0, -34.987234725632476))));
	}

	@Test
	void test616() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5266837846116296, -118.67505006310476),
                                new WheelVector(1.0, -104.6388065951783),
                                new WheelVector(0.5266837846116297, -61.32494993689523),
                                new WheelVector(1.0, -75.36119340482172))));
	}

	@Test
	void test617() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8251653236113299, -173.1527271264526),
                                new WheelVector(1.0, -145.0127652743675),
                                new WheelVector(0.3580455384995917, -164.05191311422604),
                                new WheelVector(0.668804004435434, -120.98053408400342))));
	}

	@Test
	void test618() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 145.01276527436752),
                                new WheelVector(0.82516532361133, 173.15272712645262),
                                new WheelVector(0.6688040044354339, 120.98053408400347),
                                new WheelVector(0.3580455384995918, 164.05191311422607))));
	}

	@Test
	void test619() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 109.11356470173733),
                                new WheelVector(0.43739131783149376, 138.47131824452862),
                                new WheelVector(1.0, 70.88643529826268),
                                new WheelVector(0.43739131783149376, 41.528681755471396))));
	}

	@Test
	void test620() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.624454553338102, 71.95369793751564),
                                new WheelVector(0.19423490531978052, -5.162658686248037),
                                new WheelVector(1.0, 36.42253667541704),
                                new WheelVector(0.8048501160215458, -1.2443197379295978))));
	}

	@Test
	void test621() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.19423490531978063, 5.162658686248092),
                                new WheelVector(0.6244545533381017, -71.95369793751563),
                                new WheelVector(0.8048501160215459, 1.2443197379296114),
                                new WheelVector(1.0, -36.42253667541703))));
	}

	@Test
	void test622() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.43739131783149376, -138.47131824452862),
                                new WheelVector(1.0, -109.11356470173733),
                                new WheelVector(0.4373913178314938, -41.52868175547139),
                                new WheelVector(1.0, -70.88643529826267))));
	}

	@Test
	void test623() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8048501160215457, 178.75568026207043),
                                new WheelVector(1.0, -143.57746332458296),
                                new WheelVector(0.19423490531978038, 174.837341313752),
                                new WheelVector(0.624454553338102, -108.04630206248434))));
	}

	@Test
	void test624() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 143.57746332458296),
                                new WheelVector(0.8048501160215458, -178.75568026207043),
                                new WheelVector(0.624454553338102, 108.04630206248437),
                                new WheelVector(0.19423490531978052, -174.83734131375195))));
	}

	@Test
	void test625() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 112.50000000000001),
                                new WheelVector(0.41421356237309515, 157.5),
                                new WheelVector(1.0, 67.5),
                                new WheelVector(0.41421356237309515, 22.499999999999996))));
	}

	@Test
	void test626() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6140144073823542, 82.50000000000001),
                                new WheelVector(0.1316524975873958, -52.50000000000001),
                                new WheelVector(1.0, 37.5),
                                new WheelVector(0.8001991549907408, -7.499999999999998))));
	}

	@Test
	void test627() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.13165249758739597, 52.500000000000036),
                                new WheelVector(0.6140144073823542, -82.50000000000001),
                                new WheelVector(0.8001991549907408, 7.500000000000011),
                                new WheelVector(1.0, -37.49999999999999))));
	}

	@Test
	void test628() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.41421356237309503, -157.5),
                                new WheelVector(1.0, -112.50000000000001),
                                new WheelVector(0.41421356237309515, -22.499999999999993),
                                new WheelVector(1.0, -67.5))));
	}

	@Test
	void test629() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8001991549907406, 172.5),
                                new WheelVector(1.0, -142.5),
                                new WheelVector(0.13165249758739558, 127.50000000000001),
                                new WheelVector(0.6140144073823545, -97.49999999999999))));
	}

	@Test
	void test630() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 142.5),
                                new WheelVector(0.8001991549907408, -172.5),
                                new WheelVector(0.6140144073823542, 97.5),
                                new WheelVector(0.1316524975873958, -127.50000000000001))));
	}

	@Test
	void test631() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 75.96375653207353),
                                new WheelVector(1.0, 75.96375653207353),
                                new WheelVector(1.0, 75.96375653207353),
                                new WheelVector(1.0, 75.96375653207353))));
	}

	@Test
	void test632() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 15.963756532073527),
                                new WheelVector(1.0, 15.963756532073527),
                                new WheelVector(1.0, 15.963756532073527),
                                new WheelVector(1.0, 15.963756532073527))));
	}

	@Test
	void test633() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -44.03624346792646),
                                new WheelVector(1.0, -44.03624346792646),
                                new WheelVector(1.0, -44.03624346792646),
                                new WheelVector(1.0, -44.03624346792646))));
	}

	@Test
	void test634() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -104.03624346792648),
                                new WheelVector(1.0, -104.03624346792648),
                                new WheelVector(1.0, -104.03624346792648),
                                new WheelVector(1.0, -104.03624346792648))));
	}

	@Test
	void test635() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -164.03624346792645),
                                new WheelVector(1.0, -164.03624346792645),
                                new WheelVector(1.0, -164.03624346792645),
                                new WheelVector(1.0, -164.03624346792645))));
	}

	@Test
	void test636() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.96375653207352),
                                new WheelVector(1.0, 135.96375653207352),
                                new WheelVector(1.0, 135.96375653207352),
                                new WheelVector(1.0, 135.96375653207352))));
	}

	@Test
	void test637() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9419042517911366, 86.43943974585942),
                                new WheelVector(0.660240939135938, 84.91708449537893),
                                new WheelVector(1.0, 70.06602202652105),
                                new WheelVector(0.7407661426988171, 62.59680372206706))));
	}

	@Test
	void test638() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7451475848651317, 29.47817216357882),
                                new WheelVector(0.6542307484142788, 7.466733216300676),
                                new WheelVector(1.0, 21.511078740188022),
                                new WheelVector(0.934223179406489, 5.221343317567715))));
	}

	@Test
	void test639() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6096617992173783, -43.72768582224896),
                                new WheelVector(0.8249599508899655, -57.72114886390205),
                                new WheelVector(0.8313414393933436, -30.45840517450975),
                                new WheelVector(1.0, -44.22435870603362))));
	}

	@Test
	void test640() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7407661426988171, -117.40319627793293),
                                new WheelVector(1.0, -109.93397797347895),
                                new WheelVector(0.6602409391359381, -95.08291550462108),
                                new WheelVector(0.9419042517911368, -93.56056025414058))));
	}

	@Test
	void test641() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9342231794064889, -174.77865668243228),
                                new WheelVector(1.0, -158.48892125981197),
                                new WheelVector(0.6542307484142788, -172.5332667836993),
                                new WheelVector(0.7451475848651318, -150.52182783642118))));
	}

	@Test
	void test642() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.77564129396637),
                                new WheelVector(0.8313414393933436, 149.54159482549022),
                                new WheelVector(0.8249599508899658, 122.27885113609793),
                                new WheelVector(0.6096617992173783, 136.27231417775104))));
	}

	@Test
	void test643() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9159854244266524, 94.37488255500149),
                                new WheelVector(0.4417538780931909, 99.10081401222652),
                                new WheelVector(1.0, 65.96776880963593),
                                new WheelVector(0.5967555538478875, 46.965309190908435))));
	}

	@Test
	void test644() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6057172048901012, 44.980895389896816),
                                new WheelVector(0.4310292912284206, -6.271776535551241),
                                new WheelVector(1.0, 25.35109328226231),
                                new WheelVector(0.9049270233543686, -2.9827189643354006))));
	}

	@Test
	void test645() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3468372454093991, -43.128608857921726),
                                new WheelVector(0.7434707195187863, -70.09451838242202),
                                new WheelVector(0.7533573946151971, -18.345079192487965),
                                new WheelVector(1.0, -44.35103337347799))));
	}

	@Test
	void test646() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5967555538478875, -133.0346908090916),
                                new WheelVector(1.0, -114.03223119036409),
                                new WheelVector(0.4417538780931909, -80.89918598777346),
                                new WheelVector(0.9159854244266524, -85.62511744499852))));
	}

	@Test
	void test647() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9049270233543684, 177.0172810356646),
                                new WheelVector(1.0, -154.64890671773767),
                                new WheelVector(0.4310292912284204, 173.7282234644488),
                                new WheelVector(0.6057172048901012, -135.01910461010317))));
	}

	@Test
	void test648() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.648966626522),
                                new WheelVector(0.753357394615197, 161.65492080751204),
                                new WheelVector(0.7434707195187864, 109.90548161757798),
                                new WheelVector(0.34683724540939914, 136.87139114207824))));
	}

	@Test
	void test649() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9056916495284978, 100.38051081011038),
                                new WheelVector(0.31841297104272626, 120.8315483502765),
                                new WheelVector(1.0, 62.98252648401386),
                                new WheelVector(0.5301975632748653, 31.043154814892276))));
	}

	@Test
	void test650() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5420196130075752, 60.4863487836913),
                                new WheelVector(0.30292707959731346, -28.182008330428815),
                                new WheelVector(1.0, 28.143810589504017),
                                new WheelVector(0.8932970136905617, -9.215802141768979))));
	}

	@Test
	void test651() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.15789480296213837, -41.46471295489202),
                                new WheelVector(0.7101154310049219, -80.40854563450603),
                                new WheelVector(0.7215724796935831, -8.331132039953854),
                                new WheelVector(1.0, -44.442141864583135))));
	}

	@Test
	void test652() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5301975632748652, -148.95684518510774),
                                new WheelVector(1.0, -117.01747351598613),
                                new WheelVector(0.31841297104272626, -59.1684516497235),
                                new WheelVector(0.9056916495284978, -79.61948918988962))));
	}

	@Test
	void test653() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8932970136905615, 170.78419785823104),
                                new WheelVector(1.0, -151.85618941049597),
                                new WheelVector(0.3029270795973133, 151.81799166957123),
                                new WheelVector(0.5420196130075754, -119.51365121630869))));
	}

	@Test
	void test654() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.55785813541686),
                                new WheelVector(0.7215724796935831, 171.66886796004613),
                                new WheelVector(0.7101154310049221, 99.59145436549397),
                                new WheelVector(0.1578948029621384, 138.5352870451079))));
	}

	@Test
	void test655() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9029893061200326, 104.99025745540308),
                                new WheelVector(0.27739580897282934, 147.35010012620953),
                                new WheelVector(1.0, 60.72238680964343),
                                new WheelVector(0.5114281453621343, 17.01512575268042))));
	}

	@Test
	void test656() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5241675212201612, 74.0070271956363),
                                new WheelVector(0.25939613616007273, -56.16878387063933),
                                new WheelVector(1.0, 30.257024282159488),
                                new WheelVector(0.8902442165791848, -14.007027195636285))));
	}

	@Test
	void test657() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.0173323801209993, -15.489181300929737),
                                new WheelVector(0.7012428800930345, -88.63514442892848),
                                new WheelVector(0.7131331113610453, -0.3718915434546987),
                                new WheelVector(1.0, -44.51081869906985))));
	}

	@Test
	void test658() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5114281453621342, -162.9848742473196),
                                new WheelVector(1.0, -119.27761319035656),
                                new WheelVector(0.2773958089728294, -32.64989987379045),
                                new WheelVector(0.9029893061200327, -75.00974254459693))));
	}

	@Test
	void test659() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8902442165791848, 165.99297280436372),
                                new WheelVector(1.0, -149.74297571784052),
                                new WheelVector(0.25939613616007257, 123.8312161293607),
                                new WheelVector(0.5241675212201615, -105.99297280436372))));
	}

	@Test
	void test660() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.25, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 135.48918130093014),
                                new WheelVector(0.7131331113610453, 179.62810845654528),
                                new WheelVector(0.7012428800930346, 91.36485557107152),
                                new WheelVector(0.01733238012099924, 164.51081869906966))));
	}

	@Test
	void test661() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 63.43494882292201),
                                new WheelVector(1.0, 63.43494882292201),
                                new WheelVector(1.0, 63.43494882292201),
                                new WheelVector(1.0, 63.43494882292201))));
	}

	@Test
	void test662() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 3.434948822922018),
                                new WheelVector(1.0, 3.434948822922018),
                                new WheelVector(1.0, 3.434948822922018),
                                new WheelVector(1.0, 3.434948822922018))));
	}

	@Test
	void test663() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -56.56505117707798),
                                new WheelVector(1.0, -56.56505117707798),
                                new WheelVector(1.0, -56.56505117707798),
                                new WheelVector(1.0, -56.56505117707798))));
	}

	@Test
	void test664() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -116.56505117707799),
                                new WheelVector(1.0, -116.56505117707799),
                                new WheelVector(1.0, -116.56505117707799),
                                new WheelVector(1.0, -116.56505117707799))));
	}

	@Test
	void test665() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -176.56505117707798),
                                new WheelVector(1.0, -176.56505117707798),
                                new WheelVector(1.0, -176.56505117707798),
                                new WheelVector(1.0, -176.56505117707798))));
	}

	@Test
	void test666() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 123.43494882292201),
                                new WheelVector(1.0, 123.43494882292201),
                                new WheelVector(1.0, 123.43494882292201),
                                new WheelVector(1.0, 123.43494882292201))));
	}

	@Test
	void test667() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8989696914392886, 74.64141677724956),
                                new WheelVector(0.6514902289208563, 68.56347017460088),
                                new WheelVector(1.0, 60.09633807948922),
                                new WheelVector(0.7850433187110758, 50.57617619094315))));
	}

	@Test
	void test668() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7375935534711785, 14.549033785462171),
                                new WheelVector(0.7188020416833379, -6.667085998663475),
                                new WheelVector(1.0, 10.678025115460176),
                                new WheelVector(0.9862211339278301, -4.854116402564213))));
	}

	@Test
	void test669() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6412200166097284, -59.85045985335793),
                                new WheelVector(0.8751170502185242, -68.40660562693628),
                                new WheelVector(0.8033263708591978, -43.64774549519166),
                                new WheelVector(1.0, -54.459061461344724))));
	}

	@Test
	void test670() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7850433187110758, -129.42382380905684),
                                new WheelVector(1.0, -119.90366192051079),
                                new WheelVector(0.6514902289208563, -111.43652982539912),
                                new WheelVector(0.8989696914392886, -105.35858322275044))));
	}

	@Test
	void test671() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.98622113392783, 175.1458835974358),
                                new WheelVector(1.0, -169.3219748845398),
                                new WheelVector(0.7188020416833379, 173.33291400133655),
                                new WheelVector(0.7375935534711786, -165.45096621453783))));
	}

	@Test
	void test672() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 125.54093853865528),
                                new WheelVector(0.8033263708591978, 136.35225450480831),
                                new WheelVector(0.8751170502185242, 111.59339437306372),
                                new WheelVector(0.6412200166097284, 120.14954014664207))));
	}

	@Test
	void test673() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8507982281860978, 83.82494993689524),
                                new WheelVector(0.4142135623730951, 77.23561031724536),
                                new WheelVector(1.0, 57.764389682754654),
                                new WheelVector(0.6691152742010951, 37.13880659517829))));
	}

	@Test
	void test674() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5696559648418292, 28.87888896787805),
                                new WheelVector(0.5328815940961511, -20.598136918019986),
                                new WheelVector(1.0, 15.969220280028543),
                                new WheelVector(0.9795176746984098, -11.034142431767169))));
	}

	@Test
	void test675() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.394867048464031, -65.6313651161493),
                                new WheelVector(0.8150608066773894, -78.46933388317368),
                                new WheelVector(0.7011389786490965, -30.86423845341304),
                                new WheelVector(1.0, -52.99767928752415))));
	}

	@Test
	void test676() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6691152742010951, -142.8611934048217),
                                new WheelVector(1.0, -122.23561031724535),
                                new WheelVector(0.4142135623730951, -102.76438968275464),
                                new WheelVector(0.8507982281860978, -96.17505006310476))));
	}

	@Test
	void test677() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9795176746984096, 168.96585756823288),
                                new WheelVector(1.0, -164.03077971997146),
                                new WheelVector(0.5328815940961509, 159.40186308198005),
                                new WheelVector(0.5696559648418293, -151.12111103212192))));
	}

	@Test
	void test678() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 127.00232071247585),
                                new WheelVector(0.7011389786490965, 149.13576154658696),
                                new WheelVector(0.8150608066773897, 101.53066611682632),
                                new WheelVector(0.39486704846403103, 114.36863488385067))));
	}

	@Test
	void test679() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8296752604444647, 91.1354141478194),
                                new WheelVector(0.2551139223577788, 93.69488490198852),
                                new WheelVector(1.0, 56.04867793448224),
                                new WheelVector(0.6137768939828058, 24.50559167648588))));
	}

	@Test
	void test680() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4776601905061535, 45.562862862324835),
                                new WheelVector(0.42641644889729774, -38.34747431294161),
                                new WheelVector(1.0, 19.94137470937837),
                                new WheelVector(0.9765611759105555, -15.718483639735817))));
	}

	@Test
	void test681() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.2214753208334308, -77.98604888656148),
                                new WheelVector(0.7885583779756937, -86.64850998064556),
                                new WheelVector(0.6536260416037706, -19.354948514378314),
                                new WheelVector(1.0, -51.925512203104795))));
	}

	@Test
	void test682() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6137768939828058, -155.4944083235141),
                                new WheelVector(1.0, -123.95132206551776),
                                new WheelVector(0.25511392235777886, -86.30511509801148),
                                new WheelVector(0.8296752604444648, -88.8645858521806))));
	}

	@Test
	void test683() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.9765611759105555, 164.2815163602642),
                                new WheelVector(1.0, -160.05862529062162),
                                new WheelVector(0.42641644889729763, 141.65252568705841),
                                new WheelVector(0.47766019050615366, -134.43713713767517))));
	}

	@Test
	void test684() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 128.0744877968952),
                                new WheelVector(0.6536260416037705, 160.64505148562168),
                                new WheelVector(0.7885583779756938, 93.35149001935444),
                                new WheelVector(0.22147532083343086, 102.0139511134385))));
	}

	@Test
	void test685() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8224834854518072, 96.917337940107),
                                new WheelVector(0.1715728752538099, 125.26438968275468),
                                new WheelVector(1.0, 54.735610317245346),
                                new WheelVector(0.594102825849117, 13.63870727947646))));
	}

	@Test
	void test686() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4420048273577612, 62.1545477812505),
                                new WheelVector(0.38349938853350873, -57.428905166295316),
                                new WheelVector(1.0, 23.005868272019807),
                                new WheelVector(0.9755529271126251, -19.346671515271463))));
	}

	@Test
	void test687() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.11558735776853776, -111.95844358274005),
                                new WheelVector(0.7795066873256501, -93.17856342379169),
                                new WheelVector(0.6369691999543645, -9.689009724571337),
                                new WheelVector(1.0, -51.10586984676824))));
	}

	@Test
	void test688() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.594102825849117, -166.36129272052355),
                                new WheelVector(1.0, -125.26438968275465),
                                new WheelVector(0.17157287525380993, -54.735610317245325),
                                new WheelVector(0.8224834854518072, -83.08266205989298))));
	}

	@Test
	void test689() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.975552927112625, 160.65332848472855),
                                new WheelVector(1.0, -156.9941317279802),
                                new WheelVector(0.38349938853350846, 122.5710948337047),
                                new WheelVector(0.44200482735776137, -117.8454522187495))));
	}

	@Test
	void test690() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.5, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 128.89413015323177),
                                new WheelVector(0.6369691999543644, 170.31099027542868),
                                new WheelVector(0.7795066873256501, 86.82143657620831),
                                new WheelVector(0.11558735776853787, 68.04155641725994))));
	}

	@Test
	void test691() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 53.13010235415598),
                                new WheelVector(1.0, 53.13010235415598),
                                new WheelVector(1.0, 53.13010235415598),
                                new WheelVector(1.0, 53.13010235415598))));
	}

	@Test
	void test692() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -6.869897645844016),
                                new WheelVector(1.0, -6.869897645844016),
                                new WheelVector(1.0, -6.869897645844016),
                                new WheelVector(1.0, -6.869897645844016))));
	}

	@Test
	void test693() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -66.869897645844),
                                new WheelVector(1.0, -66.869897645844),
                                new WheelVector(1.0, -66.869897645844),
                                new WheelVector(1.0, -66.869897645844))));
	}

	@Test
	void test694() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -126.86989764584402),
                                new WheelVector(1.0, -126.86989764584402),
                                new WheelVector(1.0, -126.86989764584402),
                                new WheelVector(1.0, -126.86989764584402))));
	}

	@Test
	void test695() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 173.13010235415604),
                                new WheelVector(1.0, 173.13010235415604),
                                new WheelVector(1.0, 173.13010235415604),
                                new WheelVector(1.0, 173.13010235415604))));
	}

	@Test
	void test696() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 113.13010235415598),
                                new WheelVector(1.0, 113.13010235415598),
                                new WheelVector(1.0, 113.13010235415598),
                                new WheelVector(1.0, 113.13010235415598))));
	}

	@Test
	void test697() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8738637548602601, 64.0286817554714),
                                new WheelVector(0.6696927241676609, 55.149899873790474),
                                new WheelVector(1.0, 51.777613190356576),
                                new WheelVector(0.8275569362555244, 41.613564701737324))));
	}

	@Test
	void test698() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7317502516437843, 1.4671443833194049),
                                new WheelVector(0.7651199363186816, -17.045396531324972),
                                new WheelVector(0.9747050393982984, 1.1013917264897648),
                                new WheelVector(1.0, -12.960489103187328))));
	}

	@Test
	void test699() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6884108489105687, -72.09672048755512),
                                new WheelVector(0.9178985575644508, -76.67031349966555),
                                new WheelVector(0.7945890352370024, -55.52982228305921),
                                new WheelVector(1.0, -63.27432524385805))));
	}

	@Test
	void test700() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8275569362555244, -138.38643529826265),
                                new WheelVector(1.0, -128.22238680964344),
                                new WheelVector(0.6696927241676609, -124.85010012620953),
                                new WheelVector(0.87386375486026, -115.9713182445286))));
	}

	@Test
	void test701() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 167.0395108968127),
                                new WheelVector(0.9747050393982987, -178.89860827351023),
                                new WheelVector(0.7651199363186814, 162.95460346867506),
                                new WheelVector(0.7317502516437843, -178.53285561668056))));
	}

	@Test
	void test702() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 116.72567475614196),
                                new WheelVector(0.7945890352370024, 124.47017771694077),
                                new WheelVector(0.9178985575644509, 103.32968650033443),
                                new WheelVector(0.6884108489105688, 107.90327951244487))));
	}

	@Test
	void test703() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.807610901448493, 73.67505006310476),
                                new WheelVector(0.43422251475832546, 58.48044050173161),
                                new WheelVector(1.0, 50.80960571745713),
                                new WheelVector(0.732334502931957, 30.361193404821716))));
	}

	@Test
	void test704() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5446142725038957, 12.947599965576337),
                                new WheelVector(0.6101128332797511, -29.54716914802118),
                                new WheelVector(0.9614400847074674, 7.291659833244306),
                                new WheelVector(1.0, -17.50992451405495))));
	}

	@Test
	void test705() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.46850372418397634, -80.20105754120829),
                                new WheelVector(0.8754370932059706, -84.77422852515306),
                                new WheelVector(0.6731312170842592, -43.30269001440731),
                                new WheelVector(1.0, -60.668298590023994))));
	}

	@Test
	void test706() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.732334502931957, -149.6388065951783),
                                new WheelVector(1.0, -129.19039428254288),
                                new WheelVector(0.43422251475832546, -121.51955949826838),
                                new WheelVector(0.807610901448493, -106.32494993689525))));
	}

	@Test
	void test707() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 162.49007548594508),
                                new WheelVector(0.9614400847074677, -172.70834016675568),
                                new WheelVector(0.6101128332797511, 150.45283085197886),
                                new WheelVector(0.5446142725038958, -167.05240003442364))));
	}

	@Test
	void test708() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 119.331701409976),
                                new WheelVector(0.6731312170842592, 136.69730998559265),
                                new WheelVector(0.8754370932059706, 95.22577147484694),
                                new WheelVector(0.4685037241839764, 99.79894245879169))));
	}

	@Test
	void test709() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7748352775914634, 81.83132663815762),
                                new WheelVector(0.2598640361174036, 64.93397797347895),
                                new WheelVector(1.0, 50.082915504621084),
                                new WheelVector(0.6834907533149128, 20.14480580604573))));
	}

	@Test
	void test710() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.4249587619347358, 28.183688811435637),
                                new WheelVector(0.5183603601468683, -43.72922719888927),
                                new WheelVector(0.9549306186176629, 12.132940388185327),
                                new WheelVector(1.0, -20.996883996706018))));
	}

	@Test
	void test711() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3155864139252661, -93.63213021088364),
                                new WheelVector(0.8546946734103869, -91.34034749212263),
                                new WheelVector(0.6075292584708342, -31.226018557846885),
                                new WheelVector(1.0, -58.70021903774229))));
	}

	@Test
	void test712() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6834907533149127, -159.85519419395428),
                                new WheelVector(1.0, -129.91708449537893),
                                new WheelVector(0.2598640361174036, -115.06602202652105),
                                new WheelVector(0.7748352775914634, -98.1686733618424))));
	}

	@Test
	void test713() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 159.003116003294),
                                new WheelVector(0.9549306186176632, -167.86705961181468),
                                new WheelVector(0.5183603601468681, 136.27077280111075),
                                new WheelVector(0.424958761934736, -151.81631118856433))));
	}

	@Test
	void test714() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 121.29978096225771),
                                new WheelVector(0.6075292584708339, 148.77398144215312),
                                new WheelVector(0.854694673410387, 88.65965250787737),
                                new WheelVector(0.3155864139252662, 86.36786978911633))));
	}

	@Test
	void test715() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7608440505429984, 88.56067385728574),
                                new WheelVector(0.1318909710414088, 81.66845164972352),
                                new WheelVector(1.0, 49.51747351598613),
                                new WheelVector(0.6622020529986063, 11.365571649365975))));
	}

	@Test
	void test716() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.36275291231589946, 46.24225329227793),
                                new WheelVector(0.47430577717622335, -58.06549604779587),
                                new WheelVector(0.9521678975532234, 15.971999603813243),
                                new WheelVector(1.0, -23.735883577188517))));
	}

	@Test
	void test717() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.22282264873283697, -116.0316385756798),
                                new WheelVector(0.8459043518717068, -96.63844141637749),
                                new WheelVector(0.5780101731568614, -20.26674969504559),
                                new WheelVector(1.0, -57.16472406849349))));
	}

	@Test
	void test718() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.6622020529986063, -168.63442835063404),
                                new WheelVector(1.0, -130.48252648401387),
                                new WheelVector(0.13189097104140876, -98.33154835027646),
                                new WheelVector(0.7608440505429984, -91.43932614271428))));
	}

	@Test
	void test719() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 156.2641164228115),
                                new WheelVector(0.9521678975532234, -164.02800039618674),
                                new WheelVector(0.4743057771762232, 121.93450395220415),
                                new WheelVector(0.3627529123158996, -133.75774670772202))));
	}

	@Test
	void test720() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 0.75, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 122.83527593150652),
                                new WheelVector(0.5780101731568613, 159.7332503049544),
                                new WheelVector(0.8459043518717068, 83.36155858362251),
                                new WheelVector(0.22282264873283714, 63.96836142432019))));
	}

	@Test
	void test721() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(1.0, 45.0))));
	}

	@Test
	void test722() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -14.999999999999993),
                                new WheelVector(1.0, -14.999999999999993),
                                new WheelVector(1.0, -14.999999999999993),
                                new WheelVector(1.0, -14.999999999999993))));
	}

	@Test
	void test723() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -74.99999999999999),
                                new WheelVector(1.0, -74.99999999999999),
                                new WheelVector(1.0, -74.99999999999999),
                                new WheelVector(1.0, -74.99999999999999))));
	}

	@Test
	void test724() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(1.0, -135.0))));
	}

	@Test
	void test725() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 165.00000000000003),
                                new WheelVector(1.0, 165.00000000000003),
                                new WheelVector(1.0, 165.00000000000003),
                                new WheelVector(1.0, 165.00000000000003))));
	}

	@Test
	void test726() {
		WheelVector.VectorSet set = transform.processNorthUp(0.0, 1.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 105.0),
                                new WheelVector(1.0, 105.0),
                                new WheelVector(1.0, 105.0),
                                new WheelVector(1.0, 105.0))));
	}

	@Test
	void test727() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8629545474840584, 55.02498786207575),
                                new WheelVector(0.6995577903553303, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.8629545474840584, 34.97501213792426))));
	}

	@Test
	void test728() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7362945166247831, -9.041834594776786),
                                new WheelVector(0.7993053313034556, -24.533111897082755),
                                new WheelVector(0.9503897108879052, -6.993283835370898),
                                new WheelVector(1.0, -19.38333669202841))));
	}

	@Test
	void test729() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7362945166247828, -80.9581654052232),
                                new WheelVector(0.9503897108879052, -83.0067161646291),
                                new WheelVector(0.7993053313034554, -65.46688810291722),
                                new WheelVector(1.0, -70.61666330797158))));
	}

	@Test
	void test730() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.8629545474840584, -145.02498786207573),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.6995577903553303, -135.0),
                                new WheelVector(0.8629545474840585, -124.97501213792425))));
	}

	@Test
	void test731() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 160.6166633079716),
                                new WheelVector(0.9503897108879052, 173.00671616462915),
                                new WheelVector(0.7993053313034553, 155.46688810291727),
                                new WheelVector(0.7362945166247831, 170.95816540522324))));
	}

	@Test
	void test732() {
		WheelVector.VectorSet set = transform.processNorthUp(0.25, 1.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 109.38333669202842),
                                new WheelVector(0.7993053313034556, 114.53311189708276),
                                new WheelVector(0.9503897108879052, 96.9932838353709),
                                new WheelVector(0.7362945166247831, 99.04183459477679))));
	}

	@Test
	void test733() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7836116248912244, 64.47122063449069),
                                new WheelVector(0.4775922500725172, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7836116248912244, 25.528779365509312))));
	}

	@Test
	void test734() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5431934368354895, -0.7057553859603538),
                                new WheelVector(0.6663562474808868, -35.40196970123214),
                                new WheelVector(0.9225120385471085, -0.4155559432114264),
                                new WheelVector(1.0, -22.70746906041017))));
	}

	@Test
	void test735() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.5431934368354893, -89.29424461403963),
                                new WheelVector(0.9225120385471084, -89.58444405678857),
                                new WheelVector(0.6663562474808868, -54.59803029876784),
                                new WheelVector(1.0, -67.29253093958981))));
	}

	@Test
	void test736() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7836116248912244, -154.4712206344907),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.47759225007251715, -135.0),
                                new WheelVector(0.7836116248912244, -115.52877936550931))));
	}

	@Test
	void test737() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 157.29253093958985),
                                new WheelVector(0.9225120385471086, 179.58444405678858),
                                new WheelVector(0.6663562474808866, 144.5980302987679),
                                new WheelVector(0.5431934368354895, 179.29424461403968))));
	}

	@Test
	void test738() {
		WheelVector.VectorSet set = transform.processNorthUp(0.5, 1.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 112.70746906041018),
                                new WheelVector(0.6663562474808868, 125.40196970123215),
                                new WheelVector(0.9225120385471085, 90.41555594321143),
                                new WheelVector(0.5431934368354895, 90.70575538596036))));
	}

	@Test
	void test739() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7396594713152661, 72.93835272960236),
                                new WheelVector(0.3069075870889443, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7396594713152661, 17.061647270397646))));
	}

	@Test
	void test740() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.40604684823762904, 11.122958379159098),
                                new WheelVector(0.5842575831179119, -47.005802524468436),
                                new WheelVector(0.9074784402579097, 4.951874200860876),
                                new WheelVector(1.0, -25.298823401763485))));
	}

	@Test
	void test741() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.40604684823762877, -101.12295837915909),
                                new WheelVector(0.9074784402579095, -94.95187420086087),
                                new WheelVector(0.5842575831179119, -42.99419747553154),
                                new WheelVector(1.0, -64.7011765982365))));
	}

	@Test
	void test742() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.739659471315266, -162.93835272960234),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.3069075870889442, -135.0),
                                new WheelVector(0.7396594713152661, -107.06164727039764))));
	}

	@Test
	void test743() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 154.70117659823651),
                                new WheelVector(0.9074784402579097, -175.04812579913911),
                                new WheelVector(0.5842575831179116, 132.99419747553156),
                                new WheelVector(0.4060468482376291, -168.87704162084088))));
	}

	@Test
	void test744() {
		WheelVector.VectorSet set = transform.processNorthUp(0.75, 1.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 115.2988234017635),
                                new WheelVector(0.5842575831179119, 137.00580252446844),
                                new WheelVector(0.9074784402579097, 85.04812579913913),
                                new WheelVector(0.40604684823762904, 78.8770416208409))));
	}

	@Test
	void test745() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 0);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143008, 80.26438968275465),
                                new WheelVector(0.17157287525380988, 45.0),
                                new WheelVector(1.0, 45.0),
                                new WheelVector(0.7174389352143008, 9.735610317245344))));
	}

	@Test
	void test746() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 60);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3178372451957823, 27.36780515862268),
                                new WheelVector(0.5394415938940733, -58.4494755261363),
                                new WheelVector(0.9000129339129885, 9.342870175267215),
                                new WheelVector(1.0, -27.367805158622673))));
	}

	@Test
	void test747() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 120);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.3178372451957821, -117.36780515862269),
                                new WheelVector(0.9000129339129885, -99.34287017526722),
                                new WheelVector(0.5394415938940734, -31.550524473863675),
                                new WheelVector(1.0, -62.63219484137731))));
	}

	@Test
	void test748() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 180);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(0.7174389352143007, -170.26438968275465),
                                new WheelVector(1.0, -135.0),
                                new WheelVector(0.17157287525380988, -134.99999999999997),
                                new WheelVector(0.7174389352143008, -99.73561031724536))));
	}

	@Test
	void test749() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 240);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 152.63219484137733),
                                new WheelVector(0.9000129339129886, -170.65712982473278),
                                new WheelVector(0.5394415938940732, 121.55052447386373),
                                new WheelVector(0.31783724519578244, -152.6321948413773))));
	}

	@Test
	void test750() {
		WheelVector.VectorSet set = transform.processNorthUp(1.0, 1.0, 1.0, 300);
		assertTrue(set.equals(new WheelVector.VectorSet(
                                new WheelVector(1.0, 117.36780515862269),
                                new WheelVector(0.5394415938940733, 148.4494755261363),
                                new WheelVector(0.9000129339129885, 80.65712982473278),
                                new WheelVector(0.3178372451957823, 62.63219484137731))));
	}

}
