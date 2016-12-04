import java.lang.*;
import java.io.*;
import java.io.FileReader;
import java.io.File;
class LabExam extends Thread {
 public static void main(String args[]) throws Exception {
		File f = new File("abcde.txt");
		FileReader fr = new FileReader(f);
		char[] c = new char[(int)f.length()];
		fr.read(c);
		fr.close();
		Thread t1 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a') {
				System.out.print("1.");
			}
		}
	}
};
		t1.start();
		Thread t2 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='b') {
				System.out.print("2.");
			}
		}
	}
};
		t2.start();
		Thread t3 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='c') {
				System.out.print("3.");
			}
		}
	}
};
		t3.start();
		Thread t4 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='d') {
				System.out.print("4.");
			}
		}
	}
};

		t4.start();
		Thread t5 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='e') {
				System.out.print("5.");
			}
		}
	}
};

		t5.start();
		Thread t6 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='f') {
				System.out.print("6.");
			}
		}
	}
};

		t6.start();
		Thread t7 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='g') {
				System.out.print("7.");
			}
		}
	}
};
		t7.start();
		Thread t8 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='h') {
				System.out.print("8.");
			}
		}
	}
};
		t8.start();
		Thread t9 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='i') {
				System.out.print("9.");
			}
		}
	}
};
		t9.start();
		Thread t10 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='j') {
				System.out.print("10.");
			}
		}
	}
};
		t10.start();
		Thread t11 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='k') {
				System.out.print("11.");
			}
		}
	}
};
		t11.start();
		Thread t12 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='l') {
				System.out.print("12.");
			}
		}
	}
};
		t12.start();
		Thread t13 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='m') {
				System.out.print("13.");
			}
		}
	}
};
		t13.start();
		Thread t14 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='n') {
				System.out.print("14.");
			}
		}
	}
};
		t14.start();
		Thread t15 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='o') {
				System.out.print("15.");
			}
		}
	}
};
		t15.start();
		Thread t16 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='p') {
				System.out.print("16.");
			}
		}
	}
};
		t16.start();
		Thread t17 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='q') {
				System.out.print("17.");
			}
		}
	}
};
		t17.start();
		Thread t18 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='r') {
				System.out.print("18.");
			}
		}
	}
};
				t18.start();
		Thread t19 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='s') {
				System.out.print("19.");
			}
		}
	}
};
		t19.start();
		Thread t20 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='t') {
				System.out.print("20.");
			}
		}
	}
};
		t20.start();
		Thread t21 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='u') {
				System.out.print("21.");
			}
		}
	}
};
		t21.start();
		Thread t22 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='v') {
				System.out.print("22.");
			}
		}
	}
};
		t22.start();
		Thread t23 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='w') {
				System.out.print("23.");
			}
		}
	}
};
		t23.start();
		Thread t24 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='x') {
				System.out.print("24.");
			}
		}
	}
};
		t24.start();
		Thread t25 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='y') {
				System.out.print("25.");
			}
		}
	}
};
		t25.start();
		Thread t26 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='z') {
				System.out.print("26.");
			}
		}
	}
};	
		t26.start();
	}
}


