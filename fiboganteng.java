public class fiboganteng{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = input.nextInt();;
        int jumlah[] = new int[angka];
        int a=0;
        int b=1;
		
	for (int i=0;i<angka;i++) {
            a=a+b;
            b=a-b;
            jumlah[i]=a;
        }
        
        for (int j=angka; j>=0; j--) {
            int d=jumlah[j];
            System.out.print(d+" ");
        }
    }
}
