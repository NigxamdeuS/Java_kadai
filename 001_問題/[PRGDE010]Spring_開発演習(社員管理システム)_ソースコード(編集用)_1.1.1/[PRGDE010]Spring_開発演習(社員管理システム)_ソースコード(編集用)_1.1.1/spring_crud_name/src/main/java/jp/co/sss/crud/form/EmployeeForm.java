package jp.co.sss.crud.form;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeForm {
	/** 社員ID */
	private Integer empId;

	@NotBlank(message = "パスワードを入力してください")
	private String empPass;

	@NotBlank(message = "社員名を入力してください")
	private String empName;

	@NotNull(message = "性別を選択してください")
	private Integer gender;

	@NotBlank(message = "住所を入力してください")
	private String address;

	@NotNull(message = "生年月日を入力してください")
	private Date birthday;

	@NotNull(message = "権限を選択してください")
	private Integer authority;

	@NotNull(message = "部署を選択してください")
	private Integer deptId;

	/**
	 * 社員IDの取得
	 *
	 * @return 社員ID
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * 社員IDのセット
	 *
	 * @param empId
	 *            社員ID
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * パスワードの取得
	 *
	 * @return パスワード
	 */
	public String getEmpPass() {
		return empPass;
	}

	/**
	 * パスワードのセット
	 *
	 * @param empPass
	 *            パスワード
	 */
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	/**
	 * 社員名の取得
	 *
	 * @return 社員名
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * 社員名のセット
	 *
	 * @param empName
	 *            社員名
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * 性別の取得
	 *
	 * @return 性別
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * 性別のセット
	 *
	 * @param gender
	 *            性別
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * 住所の取得
	 *
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所のセット
	 *
	 * @param address
	 *            住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 生年月日の取得
	 *
	 * @return 生年月日
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 生年月日のセット
	 
	 *
	 *
	 * @param birthday
	 *            生年月日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 権限の取得
	 *
	 * @return 権限
	 */
	public Integer getAuthority() {
		return authority;
	}

	/**
	 * 権限のセット
	 *
	 * @param authority
	 *            権限
	 */
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	/**
	 * 部署IDの取得
	 *
	 * @return 部署ID
	 */
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * 部署IDのセット
	 *
	 * @param deptId
	 *            部署ID
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
}
