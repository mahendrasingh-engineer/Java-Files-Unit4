package ans3;

import java.util.Scanner;

enum Mobile{
ACER{
	@Override
	public void printDevices() {
		// TODO Auto-generated method stub
		super.printDevices();
		System.out.println("");
	}
},
ALCATEL,
ALLVIEW,
AMAZON,
AMOI,
APPLE{
	@Override
	public void printDevices() {
		super.printDevices();
		System.out.println(""
				+ ""
				+ "Apple iPhone SE (2022) smartphone. Announced Mar 2022. Features 4.7\r\n"
				+ "  display, Apple A15 Bionic chipset,018 mAh battery, 256 GB storage, 4 GB RAM, Ion-strengthened glass.iPhone SE (2022)\r\n"
				+ "Apple iPad Air (2022) tablet. Announced Mar 2022. Feature\r\n"
				+ "Apple iPhone 13 Pro Max smartphone. Announced Sep 2021. F\r\n"
				+ "Apple iPhone 13 Pro smartphone. Announced Sep 2021. Featu\r\n"
				+ "Apple iPhone 13 smartphone. Announced Sep 2021. Features \r\n"
				+ "Apple iPhone 13 mini smartphone. Announced Sep 2021. Feat\r\n"
				+ "Apple iPad mini (2021) tablet. Announced Sep 2021. Featu\r\n"
				+ "Apple iPad 10.2 (2021) tablet. Announced Sep 2021. Featu\r\n"
				+ "Apple Watch Edition Series 7 watch. Announced Sep 2021. \r\n"
				+ "Apple Watch Series 7 watch. Announced Sep 2021. Features\r\n"
				+ "Apple Watch Series 7 Aluminum watch. Announced Sep 2021.\r\n"
				+ "Apple iPad Pro 12.9 (2021) tablet. Announced Apr 2021. F\r\n"
				+ "Apple iPad Pro 11 (2021) tablet. Announced Apr 2021. Fe\r\n"
				+ "Apple iPhone 12 Pro Max smartphone. Announced Oct 2020.\r\n"
				+ "Apple iPhone 12 Pro smartphone. Announced Oct 2020. Fe\r\n"
				+ "Apple iPhone 12 smartphone. Announced Oct 2020. Featur\r\n"
				+ "Apple iPhone 12 mini smartphone. Announced Oct 2020. F\r\n"
				+ "Apple iPad Air (2020) tablet. Announced Sep 2020. Feat\r\n"
				+ "Apple iPad 10.2 (2020) tablet. Announced Sep 2020. Fea\r\n"
				+ "Apple Watch SE watch. Announced Sep 2020. Features 1.7\r\n"
				+ "Apple Watch Series 6 Aluminum watch. Announced Sep 2020. F\r\n"
				+ "Apple Watch Series 6 watch. Announced Sep 2020. Features 1\r\n"
				+ "Apple Watch Edition Series 6 watch. Announced Sep 2020. Fe\r\n"
				+ "Apple iPad Pro 12.9 (2020) tablet. Announced Mar 2020. Fea\r\n"
				+ "Apple iPad Pro 11 (2020) tablet. Announced Mar 2020. Featu\r\n"
				+ "Apple iPhone 11 Pro Max smartphone. Announced Sep 201\r\n"
				+ "Apple iPhone 11 Pro smartphone. Announced Sep 2019. F\r\n"
				+ "Apple iPhone 11 smartphone. Announced Sep 2019. Featu\r\n"
				+ "Apple iPad 10.2 (2019) tablet. Announced Sep 2019. Feature\r\n"
				+ "Apple Watch Edition Series 5 watch. Announced Sep 2019. Fe\r\n"
				+ "Apple Watch Series 5 Aluminum watch. Announc\r\n"
				+ "Apple iPad Air (2019) tablet. Ann\r\n"
				+ "Apple iPad mini (2019) tablet. \r\n"
				+ "Apple iPad Pro 12.9 (2018) tablet"
				);
	}
},
ARCHOS,
ASUS,
ATT,
BENEFON,
BENQ,
BIRD,
BLACKBERRY,
BLACKVIEW,
BLU,
BOSCH,
CASIO,
CAT,
CELKON,
CHEA,
COOLPAD,
DELL,
EMPORIA,
ENERGIZER,
ETEN,
FAIRPHONE,
GIGABYTE,
GIONEE,
GOOGLE,
HAIER,
HONOR,
HP,
HTC,
HUAWEI,
IMATE,
IMOBILE,
ICEMOBILE,
INFINIX,
INNOSTREAM,
INQ,
INTEX,
JOLLA,
KARBONN,
KYOCERA,
LAVA,
LEECO,
LENOVO,
LG,
MAXON,
MAXWEST,
MEIZU,
MICROMAX,
MICROSOFT,
MITAC,
MITSUBISHI,
MODU,
MOTOROLA,
MWG,
NEC,
NEONODE,
NIU,
NOKIA,
NVIDIA,
O2,
ONEPLUS,
OPPO,
ORANGE,
PALM,
PANASONIC,
PANTECH,
PARLA,
PHILIPS,
PLUM,
POSH,
PRESTIGIO,
QMOBILE,
QTEK,
RAZER,
REALME,
SAGEM,
SAMSUNG,
SENDO,
SEWON,
SHARP,
SIEMENS,
SONIM,
SONY,
TMOBILE,
TCL,
TECNO,
TELIT,
THURAYA,
TOSHIBA,
ULEFONE,
UNNECTO,
VERTU,
VERYKOOL,
VIVO,
VODAFONE,
WIKO,
WND,
XCUTE,
XIAOMI,
XOLO,
YEZZ,
YOTA,
YU,
ZTE;
	
	
	
public void printDevices() {
	System.out.println(this.toString());
}
	
	
}


public class MobileCompany {
	
	public void companiModel(String name,int model){
		
	}
	
	
	public void companiModel(String name){
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("pleese enter the name of a mobile brand");
		
		String str="";
		while(str=="") {
			try {
				str=scanner.nextLine();
				Mobile.valueOf(str.toUpperCase()).printDevices();
			} catch (Exception e) {
				System.out.println("please enter a valid nname");
				str="";
			}
		}
		
		
		scanner.close();
	}
}


























