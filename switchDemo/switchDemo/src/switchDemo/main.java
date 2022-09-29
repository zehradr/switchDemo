package switchDemo;

public class main {
		
	public static void main(String[] args) {
		//char tipinde grade diye bir değişken tanımladım
		char grade = 'F';
		
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena değil: Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef kaldınız");
				break;
			default:
						System.out.println("Geçersiz not girdiniz");
		
		}

	}
// Bazen İki değer için de aynı çıktıyı vermek isteyebilirsin onun için de şunu kullanabilirsin
	//case 'B':
	//case 'C':
		//System.out.println("İyi : Geçtiniz");
		//break;
}
