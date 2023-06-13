package claimspwahci.bean;

import java.util.List;

import claimspwahci.generated.Dspart;
import lombok.Data;

@Data
public class HciRequest {
	private List<Dspart> partNumber;
	private String dealerNumber;
	private String roDate;
}
