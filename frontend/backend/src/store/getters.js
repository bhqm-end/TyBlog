const getters = {
  sidebar: state => state.app.sidebar,
  device: state => state.app.device,
  token: state => state.user.token,
  user: state => state.user.user,
  roles: state => state.user.roles,
  perms: state => state.user.perms,
  permission_routes: state => state.permission.routes
}
export default getters
