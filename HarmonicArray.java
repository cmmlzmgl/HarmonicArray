public class HarmonicArray {

    public static void main(String[] args) {
        double[] list = {1,2,3,4};
        double sum  = 0;

        for (int i = 0; i < list.length; i++)
        {
            sum += 1 / list[i];
        }

        System.out.print("Listenin Harmonik Toplamı: "+sum);
    }
}
