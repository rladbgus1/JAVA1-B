//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num;
    String result;

    System.out.print("양의 정수 입력 : ");
    num = keyboard.nextInt();

    if (num % 2 == 0) {
        result = String.format("%d는 짝수입니다.\n", num);
    }  else  {
        result = String.format("%d는 홀수입니다.\n", num);
    }

    System.out.println(result);
}