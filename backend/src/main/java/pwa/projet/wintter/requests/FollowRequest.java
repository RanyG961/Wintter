package pwa.projet.wintter.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pwa.projet.wintter.models.User;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FollowRequest
{
    private User follower;
    private User following;
}
