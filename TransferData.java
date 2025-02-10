import java.util.ArrayList;
class dataProvider {

// Returns an ArrayList of strings containing the names of the months
    public ArrayList<String> getData(){
        ArrayList<String> data = new ArrayList<String>();
        data.add("January");
        data.add("February");
        data.add("March");
        data.add("April");
        data.add("May");
        data.add("June");
        data.add("July");
        data.add("August");
        data.add("September");
        data.add("October");
        data.add("November");
        data.add("December");
        return data;
    }
}


// The dataGetter class provides methods to receive and print a list of data.
class dataGetter {
    private ArrayList<String> data;

// Receives an ArrayList of strings and stores it in the data field.

    public void seekData(ArrayList<String> data){
        this.data = data;
    }

// Prints the data stored in the data field to the console.
    public void printData(){
        for (int i = 0; i < data.size(); i++){
            System.out.println("Month is " + data.get(i));
        }
    }
}


// The TransferData class contains the main method to demonstrate the transfer and printing of data between dataProvider and dataGetter classes.

public class TransferData {
   
    public static void main(String[] args) {
        dataProvider dp = new dataProvider();
        dataGetter dg = new dataGetter();
        dg.seekData(dp.getData());
        dg.printData();
    }
}
 