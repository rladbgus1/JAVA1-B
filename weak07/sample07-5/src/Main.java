//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int salery;
    String messege;
    int tax;

    System.out.print("당신의 급여를 입력 : ");
    salery = keyboard.nextInt();

    if (salery >= 0 && salery <= 30000000){
        if (salery < 2000000){
            tax = 0;
        }  else if (salery <= 4000000){

        }  else {
            tax = (int) (salery - 2000000) * (10.0f / 100);
        }
    }  else if (salery <= 6000000) {
        tax = (int) (salery - 2000000) * (8.0f / 100);
    } else if (salery <= 2000000) {
        tax = (int) (salery - 2000000) * (6.0f / 100);
    }  else {
        messege = "ERROR : 급여액은 0 ~ 30000000 사이임";
    }

    System.out.println(messege);

}
