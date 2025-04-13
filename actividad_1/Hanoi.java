package actividad_1;

public class Hanoi {
    public static void main(String[] args){
        torresHanoi(3,1,2,3);
    }
    public static void torresHanoi(int discos, int torre1, int torre2, int torre3){
        if (discos == 1){
            System.out.println("Mover el disco de la torre " + torre1 + " a la torre " + torre3);
        } else{
            torresHanoi(discos -1, torre1, torre3,torre2);
            System.out.println("mover el disco de la torre "+ torre1 + " a la torre " + torre3);
            torresHanoi(discos -1, torre2, torre1, torre3);
}
    }
}
