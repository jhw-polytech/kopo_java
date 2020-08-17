package homework.day11ExceptionDateAPI.Lotto;

public class LottoNumberException extends Exception {

    public LottoNumberException(){
        super();
    }

    public LottoNumberException(String msg){
        super(msg);
    }
}
