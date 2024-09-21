package lesson_2;

public class HW_2_3 {

    public static void main(String[] args) {

        int hungryMin = 9;
        int SytMin = 15;
        int kolBan = 3;
        int vremyaNaOdinBanHun =  hungryMin / kolBan;
        int fvremyaNaOdinBanSyt = SytMin / kolBan;
        double raznica;
        raznica = (double) fvremyaNaOdinBanSyt / vremyaNaOdinBanHun;
        System.out.println(raznica);

    }
}
