public class fiboganteng{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = input.nextInt();;
        int a=0;
        int b=1;
        int jumlah = 0;
		
	for (int i=0;i<angka;i++) {
            
            a=a+b;
            b=a-b; 
            jumlah = a+b-1;
            jumlah= jumlah+a;
            
         }
        System.out.print(jumlah+" ");
    }
}
