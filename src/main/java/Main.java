public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // На 0 делить нельзя Варианты: 1. Поместить вызов метода devide в блок try
                                         // и в catch перехватить ошибку и там можно просто дать сообщение,
                                         //что делить на 0 нельзя.
                                         // 2. Обработать ошибку в самом методе.

        calc.println.accept(c);
    }
}
