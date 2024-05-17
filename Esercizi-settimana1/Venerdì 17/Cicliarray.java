public class Cicliarray {
    public static void main(String[] args) {
        String[] cars ={"volvo","BMW","FORD","MADZA"};
        for(int i=0;i < cars.length;i++){
            System.out.println(cars[i]);
        }


        int[][] myNumbers={{1,2,3,4},{5,6,7}};
        for(int x=0;x< myNumbers.length;x++){
            for(int y=0;y< myNumbers.length;y++){
                System.out.println(myNumbers[x][y]);
            }
            
        }
    }
    
}
