//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    String result;

    System.out.print("점수 입력 : ");
    score = keyboard.nextInt();

    if(score >= 98) {
        result = "A학점 취득 성공";

    }  else  {
        result = "A학점 취득 실패";
    }
    if(score >= 0 && score <= 100)
    result = "\n감사합니다";
    else
        result = "ERROR : 점수는 0 ~ 100 사이";

    System.out.println(result);
}


