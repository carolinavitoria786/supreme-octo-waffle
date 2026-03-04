package contas;

public class Contas {

    public int x;
    public int y;
    public int z;

    public int maiorDTres(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        int maiorValor;
        if (x > y && x > z) {
            maiorValor = x;
            System.out.printf("x(%d) é maior que y(%d) e z(%d)%n", x, y, z);
        } else if (y > x && y > z) {
            maiorValor = y;
            System.out.printf("y(%d) é maior que x(%d) e z(%d)%n", y, x, z);
        } else {
            maiorValor = z;
            System.out.printf("z(%d) é maior que x(%d) e y(%d)%n", z, x, y);
        }

        return maiorValor;
    }

    public int menorDTres(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        int menorValor;
        if (x < y && x < z) {
            menorValor = x;
            System.out.printf("x(%d) é menor que y(%d) e z(%d)%n", x, y, z);
        } else if (y < x && y < z) {
            menorValor = y;
            System.out.printf("y(%d) é menor que x(%d) e z(%d)%n", y, x, z);
        } else {
            menorValor = z;
            System.out.printf("z(%d) é menor que x(%d) e y(%d)%n", z, x, y);
        }

        return menorValor;
    }

    public int dentroInter(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        int inter;
        if (x > y && x < z) {
            inter = x;
            System.out.printf("x(%d) esta dentro do intervalo de y(%d) e z(%d)%n", x, y, z);
        } else if (x < y && x < z) {
            inter = y;
            System.out.printf("x(%d) esta fora do intervalo de y(%d) e z(%d)%n", x, y, z);
        } else {
            inter = z;
            System.out.println("OMEGALUL");
        }

        return inter;
    }

    public int div(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        int seta;
        if (x % y == 0 && x % z == 0) {
            seta = x;
            System.out.printf("x(%d) é divisivel por y(%d) e por z(%d)%n", x, y, z);
            
        } else {
            seta = y;
            System.out.printf("x(%d) não é divisivel por y(%d) nem por z(%d)%n", x, y, z);
            
        }
        return seta;
    }
}
