package med.voll.api.infra.security;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import med.voll.api.domain.usuario.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;



    public String gerarToken(Usuario usuario){

        try {
            var algoritimo = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("APIL Voll.med")
                    .withSubject(usuario.getLogin())
                    .withClaim("id", usuario.getId()) //adiciona o id do usuario no token
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritimo);
        } catch (JWTCreationException exception){
            throw new RuntimeException("Erro ao gear token", exception);
        }

    }

    private Instant dataExpiracao() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }

}
