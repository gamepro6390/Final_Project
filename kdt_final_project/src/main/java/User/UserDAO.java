package User;

import java.util.List;

import community.BoardDTO;
import travelspot.CommentsDTO;

public interface UserDAO {

	public void signup(UserDTO dto); // 회원가입

	UserDTO findByUserId(String userid);

	UserDTO getUserById(int id);

	void updateUser(UserDTO dto);

	void withdrawUser(String userid);

	UserDTO selectfindid(String email, String phone);

	UserDTO selectfindpw(String userid, String email);

	void updatePassword(UserDTO dto);

	List<BoardDTO> getBoardListByWriter(String writer);

	List<CommentsDTO> getCommentListByWriter(String writer);

	List<LikesDTO> getLikesByUserId(int user_id);
	
    List<UserDTO> getAllUsers(int startIdx, int usersPerPage);
    
    int getTotalUserCount();
    
    public UserDTO getUserdetail(String userid);

    void deleteUser(String userid) throws Exception;
}
