import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    Musteri musteri = new Musteri(1700, 2, true, true);

		List<Kredi> krediList = new ArrayList<>();
		krediList.add(new skorKontrol());
		krediList.add(new odemeGecikmeKontrol());
		krediList.add(new kefilKontrol());
		krediList.add(new maasKontrol());

		for (Kredi k: krediList) {
			k.kontrol2(musteri);
		}

		if (Kredi.deger){
			System.out.println("Kredi alabilir.");
		}else {
			System.out.println("Kredi alamaz.");
		}


//	    Kredi skor = new skorKontrol();
//	    Kredi odeme = new odemeGecikmeKontrol();
//	    Kredi kefil = new kefilKontrol();
//	    Kredi maas = new maasKontrol();

//	    skor.setKredi(odeme);
//	    odeme.setKredi(kefil);
//	    kefil.setKredi(maas);
//
//	    skor.kontrol(musteri);


    }
}
