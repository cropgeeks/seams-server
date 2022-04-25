package jhi.seams.server.util.perdix;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PerdixLoginResponse
{
	private List<MemberRecord> memberRecords;

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class MemberRecord {
		private User user;
		private Account account;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class User {
		@SerializedName("@rid")
		private String rid;
		private Authentication authentication;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Account {
		private String accountId;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Authentication {
		private String token;
	}
}
