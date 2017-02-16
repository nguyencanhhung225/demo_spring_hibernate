package dto;
// Generated Feb 15, 2017 2:14:23 PM by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "demo_hibernate")
public class Category implements java.io.Serializable {

	private Integer idCategory;
	private String name;
	private Set<Account> accounts = new HashSet<Account>(0);

	public Category() {
	}

	public Category(Integer idCategory, String name) {
		this.idCategory = idCategory;
		this.name = name;
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(String name, Set<Account> accounts) {
		this.name = name;
		this.accounts = accounts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_category", unique = true, nullable = false)
	public Integer getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}