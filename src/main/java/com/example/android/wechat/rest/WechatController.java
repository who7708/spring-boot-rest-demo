// package com.example.android.wechat.rest;
//
// import com.example.android.wechat.request.AddGroupMemberRequest;
// import com.example.android.wechat.request.AddToBlackListRequest;
// import com.example.android.wechat.request.AgreeFriendsRequest;
// import com.example.android.wechat.request.ChangePasswordRequest;
// import com.example.android.wechat.request.CheckPhoneRequest;
// import com.example.android.wechat.request.CreateGroupRequest;
// import com.example.android.wechat.request.DeleteFriendRequest;
// import com.example.android.wechat.request.DeleteGroupMemberRequest;
// import com.example.android.wechat.request.FriendInvitationRequest;
// import com.example.android.wechat.request.JoinGroupRequest;
// import com.example.android.wechat.request.LoginRequest;
// import com.example.android.wechat.request.QuitGroupRequest;
// import com.example.android.wechat.request.RegisterRequest;
// import com.example.android.wechat.request.RemoveFromBlacklistRequest;
// import com.example.android.wechat.request.RestPasswordRequest;
// import com.example.android.wechat.request.SendCodeRequest;
// import com.example.android.wechat.request.SetFriendDisplayNameRequest;
// import com.example.android.wechat.request.SetGroupDisplayNameRequest;
// import com.example.android.wechat.request.SetGroupNameRequest;
// import com.example.android.wechat.request.SetGroupPortraitRequest;
// import com.example.android.wechat.request.SetNameRequest;
// import com.example.android.wechat.request.SetPortraitRequest;
// import com.example.android.wechat.request.VerifyCodeRequest;
// import com.example.android.wechat.response.AddGroupMemberResponse;
// import com.example.android.wechat.response.AddToBlackListResponse;
// import com.example.android.wechat.response.AgreeFriendsResponse;
// import com.example.android.wechat.response.ChangePasswordResponse;
// import com.example.android.wechat.response.CheckPhoneResponse;
// import com.example.android.wechat.response.CreateGroupResponse;
// import com.example.android.wechat.response.DefaultConversationResponse;
// import com.example.android.wechat.response.DeleteFriendResponse;
// import com.example.android.wechat.response.DeleteGroupMemberResponse;
// import com.example.android.wechat.response.FriendInvitationResponse;
// import com.example.android.wechat.response.GetBlackListResponse;
// import com.example.android.wechat.response.GetFriendInfoByIDResponse;
// import com.example.android.wechat.response.GetGroupInfoResponse;
// import com.example.android.wechat.response.GetGroupMemberResponse;
// import com.example.android.wechat.response.GetGroupResponse;
// import com.example.android.wechat.response.GetTokenResponse;
// import com.example.android.wechat.response.GetUserInfoByIdResponse;
// import com.example.android.wechat.response.GetUserInfoByPhoneResponse;
// import com.example.android.wechat.response.GetUserInfosResponse;
// import com.example.android.wechat.response.JoinGroupResponse;
// import com.example.android.wechat.response.LoginResponse;
// import com.example.android.wechat.response.QiNiuTokenResponse;
// import com.example.android.wechat.response.QuitGroupResponse;
// import com.example.android.wechat.response.RegisterResponse;
// import com.example.android.wechat.response.RemoveFromBlackListResponse;
// import com.example.android.wechat.response.RestPasswordResponse;
// import com.example.android.wechat.response.SendCodeResponse;
// import com.example.android.wechat.response.SetFriendDisplayNameResponse;
// import com.example.android.wechat.response.SetGroupDisplayNameResponse;
// import com.example.android.wechat.response.SetGroupNameResponse;
// import com.example.android.wechat.response.SetGroupPortraitResponse;
// import com.example.android.wechat.response.SetNameResponse;
// import com.example.android.wechat.response.SetPortraitResponse;
// import com.example.android.wechat.response.SyncTotalDataResponse;
// import com.example.android.wechat.response.UserRelationshipResponse;
// import com.example.android.wechat.response.VerifyCodeResponse;
// import com.example.android.wechat.response.VersionResponse;
// import com.example.android.wechat.service.WechatService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//
// import javax.validation.Valid;
//
// /**
//  * @author Chris
//  * @version 1.0.0
//  * @since 2021/02/21
//  */
// // @RestController
// // @RequestMapping("/wx")
// public class WechatController {
//
//     @Autowired
//     private WechatService wechatService;
//
//     @PostMapping("/user/check_phone_available")
//     public CheckPhoneResponse checkPhoneAvailable(@RequestBody @Valid CheckPhoneRequest request) {
//         return wechatService.checkPhoneAvailable(request);
//     }
//
//     @PostMapping("/user/send_code")
//     public SendCodeResponse sendCode(@RequestBody @Valid SendCodeRequest request) {
//         return wechatService.sendCode(request);
//     }
//
//     @PostMapping("/user/verify_code")
//     public VerifyCodeResponse verifyCode(@RequestBody @Valid VerifyCodeRequest request) {
//         return wechatService.verifyCode(request);
//     }
//
//     @PostMapping("/user/register")
//     public RegisterResponse register(@RequestBody @Valid RegisterRequest request) {
//         return wechatService.register(request);
//     }
//
//     @PostMapping("/user/login")
//     public LoginResponse login(@RequestBody @Valid LoginRequest request) {
//         return wechatService.login(request);
//     }
//
//     @GetMapping("/user/get_token")
//     public GetTokenResponse getToken() {
//         return wechatService.getToken();
//     }
//
//     @PostMapping("/user/set_nickname")
//     public SetNameResponse setName(@RequestBody @Valid SetNameRequest request) {
//         return wechatService.setName(request);
//     }
//
//     @PostMapping("/user/set_portrait_uri")
//     public SetPortraitResponse setPortrait(@RequestBody @Valid SetPortraitRequest request) {
//         return wechatService.setPortrait(request);
//     }
//
//     @PostMapping("/user/change_password")
//     public ChangePasswordResponse changePassword(@RequestBody @Valid ChangePasswordRequest request) {
//         return wechatService.changePassword(request);
//     }
//
//     @PostMapping("/user/reset_password")
//     public RestPasswordResponse restPassword(@RequestBody @Valid RestPasswordRequest request) {
//         return wechatService.restPassword(request);
//     }
//
//     @GetMapping("/user/{userid}")
//     public GetUserInfoByIdResponse getUserInfoById(@PathVariable("userid") Long userid) {
//         return wechatService.getUserInfoById(userid);
//     }
//
//     @GetMapping("/user/find/{region}/{phone}")
//     public GetUserInfoByPhoneResponse getUserInfoFromPhone(@PathVariable("region") String region, @PathVariable("phone") String phone) {
//         return wechatService.getUserInfoFromPhone(region, phone);
//     }
//
//     @PostMapping("/friendship/invite")
//     public FriendInvitationResponse sendFriendInvitation(@RequestBody @Valid FriendInvitationRequest request) {
//         return wechatService.sendFriendInvitation(request);
//     }
//
//     @GetMapping("/friendship/{userId}/all")
//     public UserRelationshipResponse getAllUserRelationship(Long userId) {
//         return wechatService.getAllUserRelationship(userId);
//     }
//
//     @GetMapping("/friendship/{userid}/profile")
//     public GetFriendInfoByIDResponse getFriendInfoByID(@PathVariable("userid") String userid) {
//         return wechatService.getFriendInfoByID(userid);
//     }
//
//     @PostMapping("/friendship/agree")
//     public AgreeFriendsResponse agreeFriends(@RequestBody @Valid AgreeFriendsRequest request) {
//         return wechatService.agreeFriends(request);
//     }
//
//     @PostMapping("/friendship/delete")
//     public DeleteFriendResponse deleteFriend(@RequestBody @Valid DeleteFriendRequest request) {
//         return wechatService.deleteFriend(request);
//     }
//
//     @PostMapping("/friendship/set_display_name")
//     public SetFriendDisplayNameResponse setFriendDisplayName(@RequestBody @Valid SetFriendDisplayNameRequest request) {
//         return wechatService.setFriendDisplayName(request);
//     }
//
//     @GetMapping("/user/blacklist")
//     public GetBlackListResponse getBlackList() {
//         return wechatService.getBlackList();
//     }
//
//     @PostMapping("/user/add_to_blacklist")
//     public AddToBlackListResponse addToBlackList(@RequestBody @Valid AddToBlackListRequest request) {
//         return wechatService.addToBlackList(request);
//     }
//
//     @PostMapping("/user/remove_from_blacklist")
//     public RemoveFromBlackListResponse removeFromBlackList(@RequestBody @Valid RemoveFromBlacklistRequest request) {
//         return wechatService.removeFromBlackList(request);
//     }
//
//     @PostMapping("/group/create")
//     public CreateGroupResponse createGroup(@RequestBody @Valid CreateGroupRequest request) {
//         return wechatService.createGroup(request);
//     }
//
//     @PostMapping("/group/set_portrait_uri")
//     public SetGroupPortraitResponse setGroupPortrait(@RequestBody @Valid SetGroupPortraitRequest request) {
//         return wechatService.setGroupPortrait(request);
//     }
//
//     @GetMapping("/user/{userId}/groups")
//     public GetGroupResponse getGroups(@PathVariable("userId") Long userId) {
//         return wechatService.getGroups(userId);
//     }
//
//     @GetMapping("/group/{groupId}")
//     public GetGroupInfoResponse getGroupInfo(@PathVariable("groupId") String groupId) {
//         return wechatService.getGroupInfo(groupId);
//     }
//
//     @GetMapping("/group/{groupId}/members")
//     public GetGroupMemberResponse getGroupMember(@PathVariable("groupId") String groupId) {
//         return wechatService.getGroupMember(groupId);
//     }
//
//     @PostMapping("/group/add")
//     public AddGroupMemberResponse addGroupMember(@RequestBody @Valid AddGroupMemberRequest request) {
//         return wechatService.addGroupMember(request);
//     }
//
//     @PostMapping("/group/kick")
//     public DeleteGroupMemberResponse deleGroupMember(@RequestBody @Valid DeleteGroupMemberRequest request) {
//         return wechatService.deleGroupMember(request);
//     }
//
//     @PostMapping("/group/rename")
//     public SetGroupNameResponse setGroupName(@RequestBody @Valid SetGroupNameRequest request) {
//         return wechatService.setGroupName(request);
//     }
//
//     @PostMapping("/group/quit")
//     public QuitGroupResponse quitGroup(@RequestBody @Valid QuitGroupRequest request) {
//         return wechatService.quitGroup(request);
//     }
//
//     @PostMapping("/group/dismiss")
//     public QuitGroupResponse dissmissGroup(@RequestBody @Valid QuitGroupRequest request) {
//         return wechatService.dissmissGroup(request);
//     }
//
//     @PostMapping("/group/set_display_name")
//     public SetGroupDisplayNameResponse setGroupDisplayName(@RequestBody @Valid SetGroupDisplayNameRequest request) {
//         return wechatService.setGroupDisplayName(request);
//     }
//
//     @PostMapping("/group/join")
//     public JoinGroupResponse joinGroup(@RequestBody @Valid JoinGroupRequest request) {
//         return wechatService.joinGroup(request);
//     }
//
//     @GetMapping("misc/demo_square")
//     public DefaultConversationResponse getDefaultConversation() {
//         return wechatService.getDefaultConversation();
//     }
//
//     @GetMapping("/user/batch?{params}")
//     public GetUserInfosResponse getUserInfos(@PathVariable("params") String params) {
//         return wechatService.getUserInfos(params);
//     }
//
//     @GetMapping("/user/get_image_token")
//     public QiNiuTokenResponse getQiNiuToken() {
//         return wechatService.getQiNiuToken();
//     }
//
//     @GetMapping("/misc/client_version")
//     public VersionResponse getClientVersion() {
//         return wechatService.getClientVersion();
//     }
//
//     @GetMapping("/user/sync/{version}")
//     public SyncTotalDataResponse syncTotalData(@PathVariable("version") String version) {
//         return wechatService.syncTotalData(version);
//     }
//
//     public byte[] downloadPic(String url) {
//         return wechatService.downloadPic(url);
//     }
// }
