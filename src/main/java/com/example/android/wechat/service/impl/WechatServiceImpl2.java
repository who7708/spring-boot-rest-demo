// package com.example.android.wechat.service.impl;
//
// import com.example.android.common.utils.DataUtils;
// import com.example.android.common.utils.RSA;
// import com.example.android.wechat.model.WxUser;
// import com.example.android.wechat.repository.WxUserRepository;
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
// import org.springframework.http.HttpStatus;
// import org.springframework.stereotype.Service;
//
// import java.util.Optional;
//
// /**
//  * @author Chris
//  * @version 1.0.0
//  * @since 2021/02/21
//  */
// @Service
// public class WechatServiceImpl2 implements WechatService2 {
//
//     @Autowired
//     private WxUserRepository wxUserRepository;
//
//     @Override
//     public CheckPhoneResponse checkPhoneAvailable(CheckPhoneRequest request) {
//         return null;
//     }
//
//     @Override
//     public SendCodeResponse sendCode(SendCodeRequest request) {
//         return null;
//     }
//
//     @Override
//     public VerifyCodeResponse verifyCode(VerifyCodeRequest request) {
//         return null;
//     }
//
//     @Override
//     public RegisterResponse register(RegisterRequest request) {
//         return RegisterResponse.builder()
//                 .code(HttpStatus.OK.value())
//                 .result(RegisterResponse.ResultEntity.builder()
//                         .id(DataUtils.uuid())
//                         .build())
//                 .build();
//     }
//
//     @Override
//     public LoginResponse login(LoginRequest request) {
//         final WxUser wxUser = wxUserRepository.findFirstByRegionAndPhoneAndPassword(request.getRegion(), request.getPhone(), request.getPassword());
//         String data = wxUser.getId() + ":" + wxUser.getUserId() + ":" + System.currentTimeMillis();
//         String token = RSA.encrypt(data);
//         return LoginResponse.builder()
//                 .code(HttpStatus.OK.value())
//                 .result(LoginResponse.ResultEntity.builder()
//                         .id(String.valueOf(wxUser.getId()))
//                         .token(token)
//                         .build())
//                 .build();
//     }
//
//     @Override
//     public GetTokenResponse getToken() {
//         return null;
//     }
//
//     @Override
//     public SetNameResponse setName(SetNameRequest request) {
//         return null;
//     }
//
//     @Override
//     public SetPortraitResponse setPortrait(SetPortraitRequest request) {
//         return null;
//     }
//
//     @Override
//     public ChangePasswordResponse changePassword(ChangePasswordRequest request) {
//         return null;
//     }
//
//     @Override
//     public RestPasswordResponse restPassword(RestPasswordRequest request) {
//         return null;
//     }
//
//     @Override
//     public GetUserInfoByIdResponse getUserInfoById(Long userid) {
//         final Optional<WxUser> wxUserOptional = wxUserRepository.findById(userid);
//         if (wxUserOptional.isPresent()) {
//             WxUser wxUser = wxUserOptional.get();
//             return GetUserInfoByIdResponse.builder()
//                     .code(HttpStatus.OK.value())
//                     .result(GetUserInfoByIdResponse.ResultEntity.builder()
//                             .id(String.valueOf(wxUser.getId()))
//                             .nickname(wxUser.getNickname())
//                             .portraitUri(DataUtils.fillUrl(wxUser.getPortraitUri()))
//                             .build())
//                     .build();
//         }
//
//         return GetUserInfoByIdResponse.builder()
//                 .code(HttpStatus.OK.value())
//                 .result(GetUserInfoByIdResponse.ResultEntity.builder().build())
//                 .build();
//     }
//
//     @Override
//     public GetUserInfoByPhoneResponse getUserInfoFromPhone(String region, String phone) {
//         return null;
//     }
//
//     @Override
//     public FriendInvitationResponse sendFriendInvitation(FriendInvitationRequest request) {
//         return null;
//     }
//
//     @Override
//     public UserRelationshipResponse getAllUserRelationship(Long userId) {
//         // wxUserRepository
//         return null;
//     }
//
//     @Override
//     public GetFriendInfoByIDResponse getFriendInfoByID(String userid) {
//         return null;
//     }
//
//     @Override
//     public AgreeFriendsResponse agreeFriends(AgreeFriendsRequest request) {
//         return null;
//     }
//
//     @Override
//     public DeleteFriendResponse deleteFriend(DeleteFriendRequest request) {
//         return null;
//     }
//
//     @Override
//     public SetFriendDisplayNameResponse setFriendDisplayName(SetFriendDisplayNameRequest request) {
//         return null;
//     }
//
//     @Override
//     public GetBlackListResponse getBlackList() {
//         return null;
//     }
//
//     @Override
//     public AddToBlackListResponse addToBlackList(AddToBlackListRequest request) {
//         return null;
//     }
//
//     @Override
//     public RemoveFromBlackListResponse removeFromBlackList(RemoveFromBlacklistRequest request) {
//         return null;
//     }
//
//     @Override
//     public CreateGroupResponse createGroup(CreateGroupRequest request) {
//         return null;
//     }
//
//     @Override
//     public SetGroupPortraitResponse setGroupPortrait(SetGroupPortraitRequest request) {
//         return null;
//     }
//
//     @Override
//     public GetGroupResponse getGroups(Long userId) {
//
//         return null;
//     }
//
//     @Override
//     public GetGroupInfoResponse getGroupInfo(String groupId) {
//         return null;
//     }
//
//     @Override
//     public GetGroupMemberResponse getGroupMember(String groupId) {
//         return null;
//     }
//
//     @Override
//     public AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request) {
//         return null;
//     }
//
//     @Override
//     public DeleteGroupMemberResponse deleGroupMember(DeleteGroupMemberRequest request) {
//         return null;
//     }
//
//     @Override
//     public SetGroupNameResponse setGroupName(SetGroupNameRequest request) {
//         return null;
//     }
//
//     @Override
//     public QuitGroupResponse quitGroup(QuitGroupRequest request) {
//         return null;
//     }
//
//     @Override
//     public QuitGroupResponse dissmissGroup(QuitGroupRequest request) {
//         return null;
//     }
//
//     @Override
//     public SetGroupDisplayNameResponse setGroupDisplayName(SetGroupDisplayNameRequest request) {
//         return null;
//     }
//
//     @Override
//     public JoinGroupResponse joinGroup(JoinGroupRequest request) {
//         return null;
//     }
//
//     @Override
//     public DefaultConversationResponse getDefaultConversation() {
//         return null;
//     }
//
//     @Override
//     public GetUserInfosResponse getUserInfos(String params) {
//         return null;
//     }
//
//     @Override
//     public QiNiuTokenResponse getQiNiuToken() {
//         return null;
//     }
//
//     @Override
//     public VersionResponse getClientVersion() {
//         return null;
//     }
//
//     @Override
//     public SyncTotalDataResponse syncTotalData(String version) {
//         return null;
//     }
//
//     @Override
//     public byte[] downloadPic(String url) {
//         return null;
//     }
// }
