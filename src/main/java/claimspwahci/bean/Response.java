package claimspwahci.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean isSuccess;
	private String sourceSystem;
	private String status;
	private String statusCode;
	private String message;
	private Object data;
	
	public Response(Boolean isSuccess, String sourceSystem, String status, String statusCode, Object data) {
		this.isSuccess = isSuccess;
		this.sourceSystem = sourceSystem;
		this.status = status;
		this.statusCode = statusCode;
		this.data = data;
	}
	
	public Response(Boolean isSuccess, String status, String statusCode,String message) {
		this.isSuccess = isSuccess;
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
	}

	public Response(Boolean isSuccess, String sourceSystem, String status, String statusCode, String message,
			Object data) {
		this.isSuccess = isSuccess;
		this.sourceSystem = sourceSystem;
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}

	public Response() {
	}
}
