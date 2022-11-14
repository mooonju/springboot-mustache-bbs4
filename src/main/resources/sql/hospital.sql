SELECT hospital_name, road_name_address FROM `likelion-db`.nation_wide_hospitals
WHERE road_name_address LIKE '경기도 수원시%'
AND hospital_name like "%피부과%";