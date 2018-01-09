
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

public class Soal1 {

    public static void main(String[] args){
        Map<String,String> values = new HashMap<>();
        values.put("001","Muhammad Yusuf"); 
        values.put("002","Dimas Maryanto");
        values.put("006","Hari Sapto Adi");
        values.put("007","Putri Harahap");
        values.put("008","Dewa Nyoman Santosa");        
        values.put("009","Hariaty");
        values.put("010","Karina Virgi");

         
            System.out.println(
                String.format(
                "Nama Saya %s, nipnya 010 ",values.get("010")));
        }
    }