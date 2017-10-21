package jackson.mapping.jacksonovanje;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JavaMapping {
    
	@JsonProperty("ID")
	String id;
    @JsonProperty("SortAs")
	String sortAs;
    @JsonProperty("GlossTerm")
	String glossTerm;
    @JsonProperty("Abbrev")
    String abbrev;
	


	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

		@Override
	public String toString() {
		return "JavaMapping [id=" + id + ", sortAs=" + sortAs + ", glossTerm=" + glossTerm + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSortAs() {
		return sortAs;
	}

	public void setSortAs(String sortAs) {
		this.sortAs = sortAs;
	}

	public String getGlossTerm() {
		return glossTerm;
	}

	public void setGlossTerm(String glossTerm) {
		this.glossTerm = glossTerm;
	}

	public String getAbbrev() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
