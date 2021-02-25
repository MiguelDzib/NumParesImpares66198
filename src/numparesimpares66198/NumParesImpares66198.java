
package numparesimpares66198;

public class NumParesImpares66198 {

    public static void main(String[] args) {
    
    int i=1;
    int sumaPar=0;
    int sumaImp=0;
    
    while (i<=100){
        
        if(i%2==0){
            sumaPar= sumaPar + i;
        }
        else if (i%2!=0){
            sumaImp= sumaImp +i;
        }
     i++;       
        
    }
    System.out.println(" SUMATORIA PAR: " + sumaPar);
    System.out.println(" SUMATORIA IMPAR: " + sumaImp);
    
          
    }
    
}
