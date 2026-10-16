//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int width, height, area;
    String result;

    System.out.println(" 사각형의 가로 길이와 세로 길이를 입력 : ");
    width = keyboard.nextInt( );
    height = keyboard.nextInt( );
    area = width * height;
    result = area > 0 ?
            String.format("\n**** %c사각형 넓이 ****\n\t가로 : %d Cm" +
                    "\n\t세로 : %d Cm\n\t넓이 : %d \u33A0",
                    width == height ? '정' : '직',  width, height, area) :
            "가로, 세로 길이를 정확하게 입력하세요";

    System.out.println(result);
}