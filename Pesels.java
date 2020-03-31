package tasks;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pesels {
    public static void compute(String []tab){
        HashMap<String,Integer> years = new HashMap<>();
        List<String> list = new ArrayList<>();
        int december = 0;
        int women = 0;
        int max = 0;
        int [] values ={1,3,7,9,1,3,7,9,1,3};
        int sum = 0;
        int remainder;
        String year = "0";
        int fifties = 0;
        int sixties = 0;
        int seventies = 0;
        int eighties = 0;
        int nineties = 0;
        for(int i = 0; i<tab.length;i++){
            //(a)
            if(tab[i].charAt(2)-48==1 && tab[i].charAt(3)-48==2) december++;
            //(b)
            if((int)(tab[i].charAt(9))%2==0) women++;
            //filling Hashmap with keys
            years.put(tab[i].substring(0,2),0);
            //(d)
            for(int j = 0;j<values.length;j++){
                sum=sum+values[j]*(tab[i].charAt(j)-48);
            }
            remainder = sum%10;
            if(remainder==0 && tab[i].charAt(10)-48!=0){
                list.add(tab[i]);
            }
            if(remainder!=0 && 10 - remainder != tab[i].charAt(10) - 48) {
                list.add(tab[i]);
            }
            sum=0;
            //(e)
            if(tab[i].charAt(0)-48==5) fifties++;
            if(tab[i].charAt(0)-48==6) sixties++;
            if(tab[i].charAt(0)-48==7) seventies++;
            if(tab[i].charAt(0)-48==8) eighties++;
            if(tab[i].charAt(0)-48==9) nineties++;
        }
        //(c)
        for(int i =0;i<tab.length;i++){
            years.put(tab[i].substring(0,2),years.get(tab[i].substring(0,2))+1);
        }
        for (Map.Entry<String, Integer> entry : years.entrySet()) {
            if(max<entry.getValue()){
                max=entry.getValue();
                year = entry.getKey();
            }
        }
        //(d) - SORT
        String temp = "";
        //arraylist to array
        String [] array = new String[list.size()];
        for(int i = 0; i<list.size();i++){
            array[i]=list.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1])>0) {
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                 }
            }
        }
        //OUTPUTS
        System.out.println("a) Osoby urodzone w grudniu: " + december);
        System.out.println("b) Kobiety w biurze: " + women);
        System.out.println("c) Rok: 19" + year);
        System.out.println("d) Niepoprawne pesele(sorted): ");
        for(String x: array) System.out.print(x + ",");
        System.out.println();
        System.out.println("e) Lata 50: " + fifties);
        System.out.println("   Lata 60: " + sixties);
        System.out.println("   Lata 70: " + seventies);
        System.out.println("   Lata 80: " + eighties);
        System.out.println("   Lata 90: " + nineties);
    }
    public static void main(String[] args) {
        String[] tab = {
                "53082806059",
                "89100192752",
                "85111779283",
                "86080941169",
                "89011129700",
                "62033089803",
                "62092569090",
                "64063159211",
                "88120262427",
                "75121005045",
                "74121108598",
                "67112966668",
                "89010737704",
                "52101156863",
                "91032272651",
                "75032006098",
                "55110906690",
                "67103111042",
                "77072919805",
                "92022716243",
                "83041812338",
                "86072032543",
                "71110410883",
                "73070871368",
                "74040249598",
                "85052135674",
                "70053179170",
                "89021468413",
                "64040919575",
                "66100294134",
                "63102092944",
                "89040205480",
                "74123184206",
                "88080204509",
                "70032057433",
                "89081421445",
                "66113183995",
                "56111161549",
                "78103188695",
                "88080601948",
                "71093058856",
                "64022301455",
                "65102086116",
                "68112117597",
                "70101195486",
                "77111084850",
                "78123189018",
                "79110673709",
                "74120284541",
                "89082179879",
                "86070630583",
                "63122755182",
                "90112004373",
                "54043010088",
                "69122174118",
                "84051294894",
                "66111176164",
                "71112677514",
                "89040633348",
                "90053120136",
                "75123199317",
                "73112328551",
                "85031079443",
                "85052568643",
                "55022153432",
                "83041947282",
                "86081443325",
                "59110570565",
                "66063014631",
                "67120749923",
                "89081519801",
                "70120794633",
                "76121186303",
                "72031096705",
                "61100157652",
                "79012564484",
                "88111094545",
                "89040876453",
                "89120952161",
                "59083036077",
                "61121020469",
                "89040185241",
                "88080416256",
                "61032479116",
                "54020837137",
                "87072724289",
                "88103032931",
                "59042989686",
                "91023191330",
                "59031152059",
                "84112185145",
                "60102890107",
                "84050694367",
                "89041133472",
                "82072219267",
                "57102202414",
                "55123128973",
                "86070511185",
                "81101148770",
                "87071164662",
                "51011153311",
                "89052085069",
                "50102636355",
                "89011581319",
                "53122299122",
                "75113162747",
                "89102588171",
                "89022379914",
                "92080709353",
                "50101111305",
                "89042620494",
                "51102573842",
                "89021697637",
                "63092608644",
                "78102945963",
                "86061995325",
                "78011115028",
                "89042750933",
                "89112466825",
                "89020265394",
                "66100651663",
                "65062892381",
                "69030626134",
                "67113048790",
                "84051840149",
                "57073163051",
                "81081010863",
                "89062644823",
                "52110446139",
                "50021011352",
                "65092056892",
                "85052605175",
                "89032143350",
                "71123061643",
                "73103000844",
                "89012630357",
                "73010399576",
                "87070895372",
                "60061144469",
                "76043169949",
                "79101146737",
                "76043054555",
                "89082608599",
                "76122752028",
                "77120835871",
                "89010293604",
                "89091482250",
                "58122188027",
                "89052295172",
                "79070627831"
        };
        compute(tab);

    }
}
