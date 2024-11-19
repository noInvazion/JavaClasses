package packagetwo;

class Arithmetic3 {
	void add() {
		System.out.println("hello");
	}

	void subtract() {
	}
}

class One {
	void oneAdd(Arithmetic3 ar) {
		ar.add();
	}
}

public class InnerClasses {

	class RegularInnerClass {
		void methodA() {
		}
	}

	static class StaticInnerClass {
		void methodC() {
		}
	}

	void methodB() {
		class MethodLocalInnerClass {
			void methodD() {
				System.out.println("MethodLocalInnerClass");
			}
		}
		MethodLocalInnerClass mlic = new MethodLocalInnerClass();
		mlic.methodD();
	}

	public static void main(String[] args) throws Exception {
		InnerClasses in = new InnerClasses();
		in.methodB();

		RegularInnerClass rin = in.new RegularInnerClass();
		rin.methodA();

		InnerClasses.StaticInnerClass sin = new StaticInnerClass();
		sin.methodC();

		Arithmetic3 arr = new Arithmetic3();

		One hi = new One();
		hi.oneAdd(arr);
		hi.oneAdd(new Arithmetic3());

		One h2 = new One();
		h2.oneAdd(new Arithmetic3() {
			@Override
			void add() {
				System.out.println("new definition");
			}

			void divide() {
			}
		});

		Calculator2 cal = new Calculator2() {
			public void add() {
			};

			public void subtract() {
			};

			public void divide() {
			};
		};

		Advanced ad = new Advanced();
		ad.addition(cal);

		ad.addition(new Calculator2() {
			public void add() {
			};

			public void subtract() {
			};

			public void divide() {
			};
		});

	}

}

interface Calculator2 {
	void add();

	void subtract();

	void divide();
}

class Advanced {
	void addition(Calculator calc) {
		calc.add();
	}
}
