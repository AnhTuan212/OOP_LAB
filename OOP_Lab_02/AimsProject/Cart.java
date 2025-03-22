package OOP_Lab_02.AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < 19){ // 0 -> 19 is 20
            itemsOrdered[qtyOrdered] = disc ;
            qtyOrdered+=1;
            System.out.println("The disc has been added: "+ disc.getTitle());
        }
        else{
            System.out.println("Your cart is full. Please remove");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int j = 0;
        for(int i = 0 ;i < qtyOrdered;i++){ //check
            if (disc == itemsOrdered[i]){
                j = i;
                break;
            }
        }
        itemsOrdered[j] = null; // remove
        for(int k = j; k < qtyOrdered-1;k++){ // dịch chuyển bù cho disc đã mất
            itemsOrdered[k] = itemsOrdered[k+1];
        }
        itemsOrdered[qtyOrdered - 1] = null;
        qtyOrdered -=1;
        System.out.println("The disc has been removed: "+ disc.getTitle());
    }
    public double totalCost() {
        float total = 0;
        for (DigitalVideoDisc i : itemsOrdered) {
            if (i != null) {
                total += i.getCost();
            }
        }
        return total;
    }

    public void show(){
        System.out.println("The current item are: ");
        for (DigitalVideoDisc i : itemsOrdered) {
            if (i != null) {
                System.out.println(i.getTitle() + " ,Unique ID: "+ i.getId());
            }
        }
        System.out.println("The number of current item are: "+qtyOrdered);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        int number = dvdList.length;
        int j = 0;
        if (number + qtyOrdered < 19){
            for(int i = qtyOrdered ; i< (qtyOrdered + number) ;i++){
                itemsOrdered[i] = dvdList[j];
                j +=1 ;
                System.out.println("The disc has been added: "+ itemsOrdered[i].getTitle());
            }
            qtyOrdered += number;
        }
        else {
            System.out.println("Please remove "+ (20-(number+qtyOrdered))+ " item from dvdList to put in Cart");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1 ,DigitalVideoDisc disc2 ){
        if (qtyOrdered + 2 < 19){ // 0 -> 19 is 20
            itemsOrdered[qtyOrdered] = disc1 ;
            qtyOrdered+=1;
            System.out.println("The disc has been added: "+ disc1.getTitle());
            itemsOrdered[qtyOrdered] = disc2 ;
            qtyOrdered+=1;
            System.out.println("The disc has been added: "+ disc2.getTitle());
        }
        else{
            System.out.println("Your cart is full. Please remove");
        }
    }
}
