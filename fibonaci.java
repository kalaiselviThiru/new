class fibonaci {
public static void main(String[] args) {
int n = 20; 
int firstTerm = 0, secondTerm = 1;
System.out.println("Fibonacci Series up to " + n + " terms:");
for (int i = 1; i <= n; i++) {
System.out.print(firstTerm + " ");
System.out.print("Done");
int nextTerm = firstTerm + secondTerm;
firstTerm = secondTerm;
secondTerm = nextTerm;
}
}
}

