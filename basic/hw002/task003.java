// *Сравнить время выполнения замены символа "а" на "А" любой 
// строки содержащей >1000 символов средствами String и StringBuilder.

package hw002;

public class task003 {

  public static void main(String[] args) {
    String thouthandCharsString = "В своём стремлении повысить качество жизни, они забывают, что базовый вектор развития выявляет срочную потребность благоприятных перспектив. Таким образом, начало повседневной работы по формированию позиции, а также свежий взгляд на привычные вещи — безусловно открывает новые горизонты для модели развития. Наше дело не так однозначно, как может показаться: социально-экономическое развитие требует анализа экономической целесообразности принимаемых решений. Внезапно, действия представителей оппозиции формируют глобальную экономическую сеть и при этом — подвергнуты целой серии независимых исследований. Картельные сговоры не допускают ситуации, при которой непосредственные участники технического прогресса освещают чрезвычайно интересные особенности картины в целом, однако конкретные выводы, разумеется, преданы социально-демократической анафеме. В рамках спецификации современных стандартов, явные признаки победы институционализации объявлены нарушающими общечеловеческие нормы этики и морали.";
    System.out.println("String: ");
    String str = thouthandCharsString;
    Long startStr = System.currentTimeMillis();
    System.out.printf("Start from %d ms\n", startStr);
    String newStr = str.replaceAll("а", "А");
    Long finishStr = System.currentTimeMillis();
    System.out.printf("Finish at %d ms\n", finishStr);
    System.out.printf("Difference %d ms\n", finishStr-startStr);
    System.out.println(newStr);

    System.out.println("~".repeat(15));

    System.out.println("StringBuilder: ");
    StringBuilder sb = new StringBuilder(thouthandCharsString);
    Long startSb = System.currentTimeMillis();
    System.out.printf("Start from %d ms\n", startSb);
    String newStrSb = sb.toString().replaceAll("а", "А");
    Long finishSb = System.currentTimeMillis();
    System.out.printf("Finish at %d ms\n", finishSb);
    System.out.printf("Difference %d ms\n", finishSb-startSb);
    System.out.println(newStrSb);
  }
}