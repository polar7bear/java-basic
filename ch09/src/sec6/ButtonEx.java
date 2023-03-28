package sec6;

public class ButtonEx {

	public static void main(String[] args) {
		Button btn0k = new Button();
		
		btn0k.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("0k 버튼을 클릭했습니다.");
			}
		});
		btn0k.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
				
			}
		});
		btnCancel.click();
	}

}
