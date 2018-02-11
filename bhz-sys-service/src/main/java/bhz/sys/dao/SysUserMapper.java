package bhz.sys.dao;

import java.util.List;

import bhz.comm.anno.VincentDao;
import bhz.sys.entity.SysUser;

@VincentDao(service = "sys-service")
public interface SysUserMapper {
	List<SysUser> getAllUser();
}
