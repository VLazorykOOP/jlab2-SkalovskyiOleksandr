public class Money {
    private long grn;
    private byte kop;

    public Money(long grn, byte kop) {
        this.grn = grn;
        this.kop = kop;
    }

    public long getGrn() {
        return grn;
    }

    public byte getKop() {
        return kop;
    }

    public Money add(Money other) {
        long totalGrn = this.grn + other.grn;
        byte totalKop = (byte) (this.kop + other.kop);
        if (totalKop >= 100) {
            totalGrn += totalKop / 100;
            totalKop %= 100;
        }
        return new Money(totalGrn, totalKop);
    }

    public Money subtract(Money other) {
        long totalGrn = this.grn - other.grn;
        byte totalKop = (byte) (this.kop - other.kop);
        if (totalKop < 0) {
            totalGrn -= 1;
            totalKop += 100;
        }
        return new Money(totalGrn, totalKop);
    }

    public Money divide(int divisor) {
        long totalGrn = this.grn / divisor;
        byte totalKop = (byte) ((this.grn % divisor * 100 + this.kop) / divisor);
        return new Money(totalGrn, totalKop);
    }

    public double divide(Money divisor) {
        double thisAmount = this.grn + this.kop / 100.0;
        double divisorAmount = divisor.grn + divisor.kop / 100.0;
        return thisAmount / divisorAmount;
    }

    public boolean isEqual(Money other) {
        return this.grn == other.grn && this.kop == other.kop;
    }

    @Override
    public String toString() {
        return grn + "." + String.format("%02d", kop);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money other = (Money) obj;
        return this.grn == other.grn && this.kop == other.kop;
    }

    public static void main(String[] args) {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 30);
        Money money3 = new Money(15, (byte) 80);

        System.out.println("Money 1: " + money1);
        System.out.println("Money 2: " + money2);
        System.out.println("Money 3: " + money3);

        Money sum = money1.add(money2);
        System.out.println("Sum: " + sum);

        Money difference = money1.subtract(money2);
        System.out.println("Difference: " + difference);

        Money divided = money1.divide(2);
        System.out.println("Divided: " + divided);

        double ratio = money1.divide(money2);
        System.out.println("Ratio: " + ratio);

        boolean isEqual = money1.isEqual(money3);
        System.out.println("Is Equal: " + isEqual);
    }
}
