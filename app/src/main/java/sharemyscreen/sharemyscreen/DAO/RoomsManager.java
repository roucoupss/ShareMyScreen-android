package sharemyscreen.sharemyscreen.DAO;

import android.content.Context;

import java.util.List;

import sharemyscreen.sharemyscreen.Entities.RoomEntity;

/**
 * Created by roucou-c on 09/12/15.
 */
public class RoomsManager extends RoomsDAO{

    private final RoomByProfileManager _roomByProfileManager;

    public RoomsManager(Context pContext) {
        super(pContext);
        _roomByProfileManager = new RoomByProfileManager(pContext);
    }

    public void addRoom(String name) {
        RoomEntity room = new RoomEntity(0, name);
        super.add(room);
    }

    @Override
    public List<RoomEntity> selectAll(String orderBy) {
        return super.selectAll(orderBy);
    }

    @Override
    public long add(RoomEntity room) {
        if (room.get_members() != null) {
            _roomByProfileManager.add(room.get_members(), room.get__id());
        }
        return super.add(room);
    }

    public void add(List<RoomEntity> roomEntityList) {
        if (roomEntityList != null) {
            for (RoomEntity roomEntity : roomEntityList) {
                long room_id = this.add(roomEntity);

            }
        }
    }

    public void delete(String room__id) {
        if (room__id != null) {
            this._roomByProfileManager.deleteByRoom_id(room__id);
            super.delete(room__id);
        }
    }
}
