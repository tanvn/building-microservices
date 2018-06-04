package demo;

public class PersonNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long personId;

	public Long getPersonId() {
		return personId;
	}

	public PersonNotFoundException(Long personId) {
		super("person# " + personId + " was not found");
		this.personId = personId;
	}

}
