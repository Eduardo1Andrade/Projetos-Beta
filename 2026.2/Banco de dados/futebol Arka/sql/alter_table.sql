-- adicionar chaves estrangeiras em cada tabela associativa
ALTER TABLE pertence ADD FOREIGN KEY(time_id) REFERENCES times_futebol (time_id);
ALTER TABLE pertence ADD FOREIGN KEY(joga_id) REFERENCES jogador (joga_id);
ALTER TABLE inscreve ADD FOREIGN KEY(time_id) REFERENCES times_futebol (time_id);
ALTER TABLE inscreve ADD FOREIGN KEY(camp_id) REFERENCES campeonato (camp_id);
ALTER TABLE contem ADD FOREIGN KEY(esta_id) REFERENCES estadio (esta_id);
ALTER TABLE contem ADD FOREIGN KEY(parti_id) REFERENCES partida (parti_id)