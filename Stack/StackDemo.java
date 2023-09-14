package Stack;

public class StackDemo {
	int s[] = new int[10];
	int pos;
	int i;

	StackDemo() {
		pos = -1;
		i = 0;
		

	}

	void push(int ele) {
		if (pos > 9) {
			System.out.println("stack is full");
		} else {
			s[++pos] = ele;
		}
	}

	int pop() {                          /// queue $ stack
		if (pos >= 0) {

			return s[i++];

		} else {
			System.out.println("stack is empty");
			return -1;
		}
	}
}
