package org.lucasluo.ironman.user.view.user;

import java.util.List;
import lombok.NoArgsConstructor;
import org.lucasluo.ironman.base.view.BaseResponse;
import org.lucasluo.ironman.user.entity.user.UserEntity;

@NoArgsConstructor
public class GetAllUsersResponse extends BaseResponse<List<UserEntity>> {

    public GetAllUsersResponse(String message) {
        super(message);
    }
}
