class SmallestNumber{
public static void main(String[]args){
    int a=21;
    int b=26;
    int c=20;

int firstsmallest= (a<b)? a:b;
int smallest= (firstsmallest<c)? firstsmallest:c;
System.out.println("the smallest number is "+smallest);
}
}