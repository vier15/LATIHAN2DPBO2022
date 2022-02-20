import java.util.*;

public class main {

    public static void main(String[] args) {

        /* Deklarasi variabel tampungan input */

        /* Memory */
        String inputFrequency = "";
        String inputMemorySize = "";
        String inputSupportsCuda = "";
        /* Product */
        String inputPrice = "";
        String inputIdProduct = "";
        /* Hardware */
        String inputBrand = "";
        String inputModel = "";

        /* Deklarasi scanner untuk input */
        Scanner sc = new Scanner(System.in);

        /* Inputting */
        System.out.print("Input Frequency... ");
        try{
                inputFrequency = sc.next();
        }catch(Exception e){}

        System.out.print("Input Memory Size... ");
        try{
                inputMemorySize = sc.next();
        }catch(Exception e){}

        System.out.print("Input Supports Cuda... ");
        try{
                inputSupportsCuda = sc.next();
        }catch(Exception e){}
        
        System.out.print("Input Price... ");
        try{
                inputPrice = sc.next();
        }catch(Exception e){}

        System.out.print("Input Id Product... ");
        try{
                inputIdProduct = sc.next();
        }catch(Exception e){}

        System.out.print("Input Brand... ");
        try{
                inputBrand = sc.next();
        }catch(Exception e){}

        System.out.print("Input Model... ");
        try{
                inputModel = sc.next();
        }catch(Exception e){}

        System.out.println(" ");
        
        /* Deklarasi objek Memory dengan nama memory1 */
        Memory memory1 = new Memory();

        /* Inisalisasi dengan method Setter sesuai dengan input */
        memory1.setFrequency(inputFrequency);
        memory1.setMemorySize(inputMemorySize);
        memory1.setSupportsCuda(inputSupportsCuda);

        memory1.setPrice(inputPrice);
        memory1.setIdProduct(inputIdProduct);

        memory1.setBrand(inputBrand);
        memory1.setModel(inputModel);

        /* Tampilkan data Memory */
        memory1.showMemoryData();

    }

}