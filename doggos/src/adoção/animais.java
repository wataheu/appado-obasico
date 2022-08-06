package adoção;
import java.util.ArrayList;
public class animais {
   private static String nome;
    private String cor;
    private String localização;
    private String raça;
    private String idade;
    ArrayList<cachorros> cachorros;
    ArrayList<gatos> gatos;
 public String cor() {
  return cor;
 }
 public static String nome() {
  return nome;
 }
 public static void setNome(String nome) {
  animais.nome = nome;
 }
 public String localização() {
  return localização;
 }
 public void setLocalização(String localização) {
  this.localização = localização;
 }
 public String raça() {
  return raça;
 }
 public void setRaça(String raça) {
  this.raça = raça;
 }
 public String idade() {
  return idade;
 }
 public void setIdade(String idade) {
  this.idade = idade;
 }
 public void setCor(String cor) {
  this.cor = cor;
 }
}
