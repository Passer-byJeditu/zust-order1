package cn.edu.zust.se.order.servlet;

import cn.edu.zust.se.order.servlet.base.BaseServlet;
import cn.edu.zust.se.order.util.DBUtil;
import cn.edu.zust.se.order.vo.Goods;
import cn.edu.zust.se.order.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "sellerServlet",urlPatterns = "/seller/*")
public class SellerServlet extends BaseServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uri=req.getRequestURI();
        int index=uri.lastIndexOf("/");
        String methodName=uri.substring(index+1);
        out.println("uri:"+uri.substring(index+1));
        out.println(req.getMethod());
        if("up_sho".equals(methodName)){
                doup_sho(req,res);
        }
        if("back2".equals(methodName)){
            doback2(req,res);
        }
        if("down_sho".equals(methodName)){
            dodown_shoe(req,res);
        }
        if("update_sho".equals(methodName)){
            doupdate_sho(req,res);
        }
        if("selljsp".equals(methodName)){
            doselljsp(req,res);
        }
        if("zhongzhuan".equals(methodName)){
            dozhongzhuan(req,res);
        }
        if("back".equals(methodName)){
            doback(req,res);
        }
        if("butdown".equals(methodName)){
            dobutdown(req,res);
        }
        if("butdown1".equals(methodName)){
            dobutdown1(req,res);
        }

        if("butdown2".equals(methodName)){
            dobutdown2(req,res);
        }

        if("butdown3".equals(methodName)){
            dobutdown3(req,res);
        }

        if("butdown4".equals(methodName)){
            dobutdown4(req,res);
        }

        if("butdown5".equals(methodName)){
            dobutdown5(req,res);
        }

    }
    public void doback2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs3User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        req.getRequestDispatcher("/WEB-INF/jsp/sell.jsp").forward(req,res);
    }
    public void dobutdown(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(0).getId();
        out.println(id);
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="????????????????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(1).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="????????????????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(2).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="????????????????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(3).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="????????????????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(4).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="????????????????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(5).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="????????????????????????????????????";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doup_sho(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String category = req.getParameter("category");
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int sell_id =user.getId();
            int price = Integer.parseInt(req.getParameter("price"));
            int num = Integer.parseInt(req.getParameter("num"));
            int status = Integer.parseInt(req.getParameter("status"));
            Date d = new Date();// new Date()???????????????????????????
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM???HH???SSS?????????
            //????????????java.text.*???
            String create_time = sdf.format(d);
            String up_time = create_time;
            String down_time="0001-1-1 0:00:00";
            ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
            if (rs.next()){
                String str="????????????????????????????????????";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
            else {
                String sql="insert into t_goods values("+id+",'"+name+"','"+category+"',"+sell_id+","+price+","+num+",'"+up_time+"','"+down_time+"','"+create_time+"',"+status+")";
                DBUtil.update(sql);
                out.println("??????????????????");
                String str="??????????????????";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dodown_shoe(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
int id= Integer.parseInt(req.getParameter("id"));
String name=req.getParameter("name");
ResultSet rs=DBUtil.select("select * from t_goods where id="+id+" and name='"+name+"'");
        try {
            if (rs.next()){
                Date d = new Date();// new Date()???????????????????????????
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM???HH???SSS?????????
                //????????????java.text.*???
                String down_time = sdf.format(d);
                int status=0;
                String sql="update t_goods set down_time='"+down_time+"',status="+status+" where id="+id+" and name='"+name+"'";
                DBUtil.update(sql);
                String str="??????????????????";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }else{
                String str="???????????????????????????????????????????????????";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doupdate_sho(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String category = req.getParameter("category");
        int price = Integer.parseInt(req.getParameter("price"));
        int num = Integer.parseInt(req.getParameter("num"));
        int status = Integer.parseInt(req.getParameter("status"));
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                String sql="update t_goods set name='"+name+"',category='"+category+"',price="+price+",num="+num+",status="+status+" where id="+id+"";
                DBUtil.update(sql);
                String str="????????????????????????";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
            else {
                String str="??????????????????";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doselljsp(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs3User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        req.getRequestDispatcher("/WEB-INF/jsp/sell.jsp").forward(req,res);
    }
    public void dozhongzhuan(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs3User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        req.getRequestDispatcher("/WEB-INF/jsp/sell.jsp").forward(req,res);
    }
    public  void doback(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/sellerHome.jsp").forward(req,res);
    }
    public Goods rs3User(ResultSet rs) throws SQLException {
        Goods u=new Goods();
        u.setId(rs.getInt("id"));
        u.setName(rs.getString("name"));
        u.setCategory(rs.getString("category"));
        u.setSell_id(rs.getInt("seller_id"));
        u.setPrice((rs.getInt("price")));
        u.setNum(Integer.parseInt(rs.getString("num")));
        u.setUp_time(rs.getString("up_time"));
        u.setDown_time(rs.getString("down_time"));
        u.setCreate_time(rs.getString("create_time"));
        u.setStatus(rs.getInt("status"));
        return u;
    }
}
