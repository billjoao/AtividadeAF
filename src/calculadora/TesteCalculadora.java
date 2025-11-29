package src.calculadora;

/**
 * <p><strong>Classe de teste para a Calculadora</strong></p>
 *
 * <p>
 * Esta classe demonstra o uso da classe {@link Calculadora} executando
 * diversas operações matemáticas e exibindo seus resultados no console.
 * Também testa o tratamento de exceções para operadores inválidos e
 * divisão por zero.
 * </p>
 *
 * <p>
 * O objetivo desta classe é validar o funcionamento dos métodos da
 * classe Calculadora e servir como um exemplo simples de uso.
 * </p>
 *
 * @author João Eduardo
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>
     * Método principal que executa os testes com a classe {@link Calculadora}.
     * </p>
     *
     * <p>
     * São demonstradas operações válidas e também situações que geram
     * exceção, como divisão por zero e operador inválido.
     * </p>
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2,  3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3,  5, "*"));
        System.out.println(calc.calcular(8,  2, "/"));

        try {
            System.out.println(calc.calcular(8,  0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5,  5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
