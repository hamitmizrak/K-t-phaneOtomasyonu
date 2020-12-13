package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.JavaDto;

public class JavaDao implements IDaoImplements<JavaDto> {

	@Override
	public void create(JavaDto javaDto) {
		try (Connection connection = getInterfaceConnection()) { // try with resources otomatik kapatmayı sağlıyor.

			String sql = "insert java (kitap_adi,fiyat,yazar_adi,basim_yili) values (?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, javaDto.getKitapAdi());
			preparedStatement.setDouble(2, javaDto.getFiyati());
			preparedStatement.setString(3, javaDto.getYazarAdi());
			preparedStatement.setString(4, javaDto.getBasimTarihi());
			preparedStatement.executeQuery();

		} catch (SQLException e) {
			System.out.println("Java classında Ekleme sırasında hata meydana geldi");
			e.printStackTrace();
		} /*
			 * finally { if(connection!=null) connection.close(); }
			 */

	}

	@Override
	public void update(JavaDto t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(JavaDto t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<JavaDto> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
